package third

import scala.io.StdIn

object Main3_4 {
  def main(args: Array[String]): Unit = {
    val length = StdIn.readInt
    val array = StdIn.readLine().split(" ").map(_.toInt)

    val result = selectionSort(array)
    println(array.mkString(" "))
    println(result)
  }

  def selectionSort(array: Array[Int]): Int = {
    var sw = 0
    for (i <- 0 to array.length - 1) {
      var min = i
      for (j <- i to array.length - 1) {
        if (array(j) < array(min)) min = j
      }
      if (min != i) {
        swap(array, i, min)
        sw += 1
      }
    }
    sw
  }

  def swap(array: Array[Int], a: Int, b: Int): Unit = {
    val tmpValue = array(a)
    array(a) = array(b)
    array(b) = tmpValue
  }
}
