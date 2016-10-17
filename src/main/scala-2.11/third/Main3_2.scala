package third

import scala.io.StdIn

object Main3_2 {
  def main(args: Array[String]): Unit = {
    val length = StdIn.readInt
    val array = StdIn.readLine().split(" ").map(_.toInt)

    trace(array)
    insertionSort(array)
  }

  def insertionSort(array: Array[Int]): Unit = {
    val length = array.length
    for (i <- 1 to length - 1) {
      val v = array(i) // ソート済みの一つ右の値(target)
      var j = i - 1 // ソート済みの一番右側（初期位置）、左にずれていく
      // jが0以上かつソート済みの対象の値よりvが小さい場合
      while (j >= 0 && array(j) > v) {
        // ソート済みの対象の値を一つ右側に代入
        array(j + 1) = array(j)
        j -= 1
      }
      array(j + 1) = v
      trace(array)
    }
  }

  def trace(array: Array[Int]): Unit = {
    println(array.mkString(" "))
  }
}
