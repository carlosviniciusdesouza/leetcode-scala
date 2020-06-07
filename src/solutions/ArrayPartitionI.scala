package solutions


/**
 * @Author Carlos Souza
 * @Problem https://leetcode.com/problems/array-partition-i/
 *
 **/

object ArrayPartitionI {

  /**
   * Recursive
   */
  def arrayPairSum(nums: Array[Int]): Int = {
    val number = nums.sortWith(_ < _)
    if (number.length != 2) {
      val lastPair = number.slice(number.length - 2, number.length)
      lastPair.min + arrayPairSum(number.slice(0, number.length - 2))
    }
    else number.min
  }

  def main(args: Array[String]): Unit = {
    var input1 = Array(1,1,1,1)
    var input2 = Array(2,3,4,5)
    var input3 = Array(1,2,9,10)
    println(arrayPairSum(input1))
    println(arrayPairSum(input2))
    println(arrayPairSum(input3))
  }
}
