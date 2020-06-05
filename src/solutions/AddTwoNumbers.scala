package solutions

/**
 * @Author Carlos Souza
 * @Problem https://leetcode.com/problems/add-two-numbers/
 *          WIP
 **/

object AddTwoNumbers {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def addTwoNumbers2(l1: ListNode, l2: ListNode): ListNode = {
    def toStr(l1 : ListNode) : String = {
      var node = l1
      var value = ""
      while (node != null) {
        value = node.x.toString + value
        node = node.next
      }
      value
    }
    var node1 = toStr(l1)
    var node2 = toStr(l2)
    var sum = (node1.toInt + node2.toInt).toString.reverse
    var result = new ListNode(sum.head)
    sum = sum.tail
    var temp : ListNode = null
    while(!sum.isEmpty){
      temp = new ListNode(sum.head.asDigit)
    }
    new ListNode()
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var node1 = l1
    var node2 = l2
    val result = new ListNode()
    result.x = node1.x + node2.x
    var temp1 = result
    if (result.x > 9) {
      temp1 = new ListNode(result.x / 10)
      result.next = temp1
      result.x = result.x % 10
    }
    while (node1.next != null && node2.next != null) {
      val tens = temp1.x / 10
      temp1.x = temp1.x % 10
      var temp2 = new ListNode()
      node1 = node1.next
      node2 = node2.next
      temp2.x = node1.x + node2.x + tens
      temp1.next = temp2
      if (temp1.x > 9) {
        temp2 = new ListNode(temp1.x / 10)
        temp1.next = temp2
        temp1.x = temp1.x % 10
      }
      temp1 = temp2
    }
    result
  }

  def main(args: Array[String]): Unit = {

    var i1 = new ListNode()
    i1.x = 1
    var i2 = new ListNode()
    i2.x = 1
    var i3 = new ListNode()
    i3.x = 1

    i1.next = i2
    i2.next = i3

    /* Output
       [1]
     Expected
       [1,6]*/

    var i4 = new ListNode()
    i4.x = 2
    var i5 = new ListNode()
    i5.x = 2
    var i6 = new ListNode()
    i6.x = 2

    i4.next = i5
    i5.next = i6

    var result = addTwoNumbers2(i1, i4)
    println(result.x)
    while (result.next != null) {
      result = result.next
      println(result.x)
    }

  }

}
