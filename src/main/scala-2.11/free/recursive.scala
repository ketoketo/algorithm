package free

/**
  * Created by featm on 2016/10/22.
  */
object recursive {
  def main(args: Array[String]): Unit = {
//    val test = (1 to 999).toArray
    val test = Array(1, 3, 4, 99, 7)
    println(findMaximum(test, 0, 5))
  }

  def findMaximum(array: Array[Int], l:Int, r:Int): Int = {
    val m = (l + r) / 2
    var result = -9999999
    if (l == r - 1) {
      return array(l)
    } else {
      val u = findMaximum(array, l, m)
      val v = findMaximum(array, m, r)
      result = u max v
    }
    return result
  }
}
