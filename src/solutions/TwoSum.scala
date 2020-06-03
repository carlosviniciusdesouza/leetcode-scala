package solutions

/**
@Author Carlos Souza
@Problem https://leetcode.com/problems/two-sum/
**/

object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var a :  Option[Array[Int]] = Option.empty
    for(i <- 0 to (nums.length - 1) ; j <- 0 to (nums.length - 1) if (i != j ))
      if (nums(i) + nums(j) == target) {a = Option(Array(j,i)) }
    a.get
  }

  def main(args: Array[String]): Unit = {
    println(twoSum(Array(2,7,11,15), 9).toList)
  }
}
