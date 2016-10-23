package free

/**
  * Created by featm on 2016/10/17.
  */
object kuku {
  def main(args: Array[String]): Unit = {
//    for(x <- 1 to 9; y <- 1 to 9) println(x+"x"+y+"="+x*y)

    val a = -1
    val b = 1
    println(a.compareTo(b))
    println("------------------------")
    println(99 max 2)

    var list = scala.collection.mutable.Seq(1,2,3,1,4,5)
    println(list.indexOf(99))
    list = list.drop(4)
    println(list)
  }
}
