//We use this mechanism called implicit classes to extend the functionality of existing types
// Adding funcitonalities existing Types (anyVal, anyRef)
object StringExtensions {
  implicit class StringOps(val s: String)  {
    def isPalindrome: Boolean = s == s.reverse
    def isBig: Boolean = if (s.length()>10) true else false
  }

  implicit class intOps(val x: Int) {
     def isEven: Boolean = x%2 ==0 
     def add1000: Int = x+1000
  }
}
import StringExtensions._


object StringRun extends App {
 val mydata: String = "This is a sample string"
 println(mydata.toUpperCase)
 println(mydata.isPalindrome)
 println(mydata.isBig)
 println(34.isOdd)
 println(34.add1000)
 
 /* 
   34, 034, 0x, 0b...
   12.34
  */
}