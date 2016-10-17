package third

import scala.io.StdIn

object Main3_3 {
  def main(args: Array[String]): Unit = {
    val length = StdIn.readInt
    val array = StdIn.readLine().split(" ").map(_.toInt)

    val result = bubbleSort(array)
    println(array.mkString(" "))
    println(result)
  }

  def bubbleSort(array: Array[Int]): Int = {
    var sw = 0
    var flag = true // 逆隣接有無フラグ
    var count = 1 //
    while (flag) {
      flag = false
      for (j <- array.length - 1 to count by -1) {
        // 対象の要素が一つ左より小さい場合値を交換
        if (array(j) < array(j - 1)) {
          val a = array(j)
          array(j) = array(j - 1)
          array(j - 1) = a
          flag = true
          sw += 1
        }
      }
      count += 1
    }
    sw
  }
}
