package fourth

import scala.io.StdIn

/**
  * Created by tmatsuzaki on 2016/10/19.
  */
object Main4_2 {

  val stack: Array[Int] = new Array[Int](1000)
  var top: Int = 0

  def main(args: Array[String]): Unit = {
    val probArray = StdIn.readLine().split(" ")
    println(calc(probArray))
  }

  def calc(array: Array[String]): Int = {
    array.foreach( t => {
      t match {
        case "+" => push(pop() + pop())
        case "-" =>
          val num1 = pop()
          val num2 = pop()
          push(num2 - num1)
        case "*" => push(pop() * pop())
        case "/" =>
          val num1 = pop()
          val num2 = pop()
          push(num2 / num1)
        case _ => push(t.toInt)
      }
    })
    pop()
  }

  def push(value: Int): Unit = {
    stack(top) = value
    top += 1
  }

  def pop(): Int = {
    top -= 1
    val result = stack(top)
    stack(top) = 0
    result
  }

  def isEmpty(): Boolean = if (top == 0) true else false

  def isFull(): Boolean = if (stack.length == top) true else false
}
