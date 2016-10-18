package third

import scala.io.StdIn

object Main3_5 {
  def main(args: Array[String]): Unit = {
    val length = StdIn.readInt
    val array = StdIn.readLine().split(" ")

    val bsresult = bubbleSort(array)
    val ssresult = selectionSort(array)
    println(bsresult._1.mkString(" "))
    println(bsresult._2)

    var flag = true
    for (i <- 0 to bsresult._1.length - 1) if (bsresult._1(i) != ssresult(i)) flag = false
    println(ssresult.mkString(" "))
    println(judge(flag))


  }

  def judge(flag: Boolean): String = if (flag) "Stable" else "Not stable"

  def bubbleSort(array: Array[String]): (Array[String], String) = {
    var arr = array.clone()
    var flag = true
    var count = 1
    while (flag) {
      flag = false
      for (j <- arr.length - 1 to count by -1) {
        if (arr(j).substring(1) < arr(j - 1).substring(1)) {
          swap(arr, j, j - 1)
          flag = true
        }
      }
      count += 1
    }
    (arr, judge(true))
  }

  def selectionSort(array: Array[String]): Array[String] = {
    var arr = array.clone()
    for (i <- 0 to arr.length - 1) {
      var min = i
      for (j <- i to arr.length - 1) {
        if (arr(j).substring(1) < arr(min).substring(1)) min = j
      }
      if (min != i) {
        swap(arr, i, min)
      }
    }
    arr
  }

  def swap(array: Array[String], a: Int, b: Int): Unit = {
    val tmpValue = array(a)
    array(a) = array(b)
    array(b) = tmpValue
  }
}
