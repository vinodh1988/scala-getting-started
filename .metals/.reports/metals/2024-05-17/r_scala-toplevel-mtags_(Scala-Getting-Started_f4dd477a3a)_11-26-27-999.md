error id: file://<WORKSPACE>/Day4/implicit.scala:[353..354) in Input.VirtualFile("file://<WORKSPACE>/Day4/implicit.scala", "//We use this mechanism called implicit classes to extend the functionality of existing types
// Adding funcitonalities existing Types (anyVal, anyRef)
object StringExtensions {
  implicit class StringOps(val s: String)  {
    def isPalindrome: Boolean = s == s.reverse
    def isBig: Boolean = if (s.length()>10) true else false
  }

  implicit class 
}
import StringExtensions._


object StringRun extends App {
 val mydata: String = "This is a sample string"
 println(mydata.toUpperCase)
 println(mydata.isPalindrome)
 println(mydata.isBig)
}")
file://<WORKSPACE>/Day4/implicit.scala
file://<WORKSPACE>/Day4/implicit.scala:10: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace