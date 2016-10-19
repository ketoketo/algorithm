package fourth

import scala.io.StdIn
import scala.util.control.Breaks

object Main4_3 {

  def main(args: Array[String]): Unit = {
    val firstLine = StdIn.readLine().split(" ")
    val pnum = firstLine(0).toInt
    val quantum = firstLine(1).toInt
    val myq = new MyQueue
    var totaltime = 0

    // キューにつめる
    for (i <- 1 to pnum) {
      val mateArray = StdIn.readLine().split(" ")
      val materi = MyCase(mateArray(0), mateArray(1).toInt)
      myq.enqueue(materi)
    }

    var flag = true
    while (flag) {
      val entity = myq.dequeue()
      if (entity.time <= quantum) {
        totaltime += entity.time
        println(entity.pName + " " + totaltime)
      } else {
        totaltime += quantum
        val newEntity = MyCase(entity.pName, entity.time - quantum)
        myq.enqueue(newEntity)
      }
      if (myq.isEmpty) flag = false
    }
  }
}

class MyQueue {
  val myQueue = new Array[MyCase](10000000)
  var head = 0
  var tail = 0

  def isEmpty(): Boolean = head == tail

  def enqueue(value: MyCase): Unit = {
    myQueue(tail) = value
    if (tail + 1 == myQueue.length) tail = 0 else tail += 1
  }

  def dequeue(): MyCase = {
    val result = myQueue(head)
    if (head + 1 == myQueue.length) head = 0 else head += 1
    result
  }
}

case class MyCase(pName: String, time: Int)
