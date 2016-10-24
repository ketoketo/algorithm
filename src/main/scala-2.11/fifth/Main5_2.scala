package fifth

import scala.io.StdIn

object Main5_2 {
  def main(args: Array[String]): Unit = {
    val len1 = StdIn.readInt
    val arrayA = StdIn.readLine().split(" ").map(_.toInt)
    val len2 = StdIn.readInt
    val arrayB = StdIn.readLine().split(" ").map(_.toInt)

    var count = 0
    for (value <- arrayB) {
      count += searchA(value, arrayA)
    }
    println(count)
  }

  def searchA(value: Int, array: Array[Int]): Int = {
    for (valueA <- array) {
      if (value == valueA) return 1
    }
    return 0
  }
}
