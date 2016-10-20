package fourth

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Main4_4 {
  def main(args: Array[String]): Unit = {
    val num = StdIn.readInt
    var list = ListBuffer.empty[Int]

    for (i <- 1 to num) {
      val query = StdIn.readLine().split(" ")
      val value = if (query.length == 2) query(1).toInt else 0
      query(0) match {
        case "insert" => list = ListBuffer(value) ++ list
        case "delete" =>
          var flag = true
          for (i <- 0 to list.size - 1) {
            if (flag && list(i) == value) {
              list.remove(i)
              flag = false
            }
          }
        case "deleteFirst" => list = list.tail
        case "deleteLast" => list = list.init
      }
    }
    println(list.mkString(" "))
  }
}
