# Palindromic String
**Problem:-**

You have been given a String . You need to find and print whether this string is a palindrome or not. 
If yes, print YES, else print NO.

**Code:**
```
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

    try{
      println(checkPalindrome(string))
    } catch {
      case exception: Exception => {
        println("Error: " + exception.getMessage)
      }
    }
  }
}
```

**Output:**

![Screenshot from 2023-03-07 10-51-18](https://user-images.githubusercontent.com/125345690/223431833-2fb96fae-bdb8-47a6-9ed5-c31233bb9172.png)
