package solutions

/**
 * @Author Carlos Souza
 * @Problem https://leetcode.com/problems/add-two-numbers/
 *
 * For the sake of testing, the argument accepts Long instead of Int. But on LeetCode the problem accepts Int as argument
 **/

object ReverseInteger {
  def reverse(x: Long): Int = {
    try{
    var numb: Long = x
    var c = ""
    val neg = (numb < 0)
    if (neg) numb = numb * -1
    (numb.toString.length - 1 to 0 by -1).toList.foreach((y: Int) => c = c.concat(numb.toString()(y).toString))
    c.toInt * (if (neg) -1 else 1)
    } catch{
      case e : NumberFormatException => 0
    }
  }


  def main(args: Array[String]): Unit = {
    println(reverse(9646324351l))
  }
}
