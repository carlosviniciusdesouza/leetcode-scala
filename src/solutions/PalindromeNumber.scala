package solutions

/**
 * @Author Carlos Souza
 * @Problem https://leetcode.com/problems/palindrome-number/
 *
 **/

object PalindromeNumber {

  /**
   * This function is WIP, it does not work with input 1000110001
   */
  def isPalindrome_recursive(x: Int): Boolean = {
    def countDigits(x: Int) = (Math.log10(x) + 1).toInt

    def cutsides(x: Int) = x % Math.pow(10, Math.log10(x).toInt).toInt / 10

    def firstEqualsLast(x: Int) = x / Math.pow(10, Math.log10(x).toInt).toInt == x % 10

    if (x < 0) false else if (x < 10) true else if (firstEqualsLast(x))
      if (countDigits(x) - countDigits(cutsides(x)) > 2)
        false
      else isPalindrome(cutsides(x))
    else false
  }

  def isPalindrome(x: Int): Boolean = {
    if (x < 0) false else {
      var reversed = 0
      var num, remainder, original: Int = x
      while (num != 0) {
        remainder = num % 10
        reversed = reversed * 10 + remainder
        num = num / 10
      }
      original == reversed
    }
  }

  def main(args: Array[String]): Unit = {
    println("1 is " + isPalindrome(1))
    println("0 is " + isPalindrome(0))
    println("12 is " + isPalindrome(12))
    println("123 is " + isPalindrome(123))
    println("1221 is " + isPalindrome(1221))
    println("12321 is " + isPalindrome(12321))
    println("9009 is " + isPalindrome(9009))
    println("1000021 is " + isPalindrome(1000021))
    println("1000110001 is " + isPalindrome(1000110001))

    println("Edge case for recursive function = \"1000110001 is " + isPalindrome_recursive(1000110001) + "\" but should be true")

  }
}