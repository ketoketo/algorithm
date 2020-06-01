package fifth

import scala.io.StdIn

object Main5_3 {
  def main(args: Array[String]): Unit = {
    val len1 = StdIn.readInt
    val arrayA = StdIn.readLine().split(" ").map(_.toInt)
    val len2 = StdIn.readInt
    val arrayB = StdIn.readLine().split(" ").map(_.toInt)

    var count = 0
    for (value <- arrayB) {
      count += binarySearch(value, arrayA)
    }
    println(count)
  }

  def binarySearch(value: Int, array: Array[Int]): Int = {
    var left = 0
    var right = array.length
    while (left < right) {
      val mid = (left + right) / 2
      if (array(mid) == value) {
        return 1
      } else if (value < array(mid)) {
        right = mid
      } else {
        left = mid + 1
      }
    }
    return 0
  }
}
