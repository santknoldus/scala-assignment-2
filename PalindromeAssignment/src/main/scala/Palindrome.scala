package com.knoldus.palindromeassignment

object Palindrome {

  def checkPalindrome(string: String) : Boolean = {
    var reverseString = ""

    //reverse the string
    for(index <- string.length-1 to 0 by -1){
      reverseString = reverseString + string.charAt(index)
    }

    if(reverseString == string)
       true
    else
       false
  }

  def main(args: Array[String]):Unit = {
    var string = scala.io.StdIn.readLine()
    string = string.toLowerCase()
    println(checkPalindrome(string))
  }
}
