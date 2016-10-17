package second

import scala.io.StdIn

/**
  * Created by featm on 2016/10/17.
  */
object Ob2_5 {

  def main(args: Array[String]): Unit = {
    val rownum = StdIn.readInt

    var maxv = -2000000000
    var minv = StdIn.readInt

    for (i <- 2 to rownum) {
      val c = StdIn.readInt
      if (maxv < c - minv) maxv = c - minv
      if (c < minv) minv = c
    }

    println(maxv)

  }
}
