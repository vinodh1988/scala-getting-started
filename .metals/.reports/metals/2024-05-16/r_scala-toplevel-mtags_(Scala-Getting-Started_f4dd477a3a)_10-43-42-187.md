error id: file://<WORKSPACE>/Day3/OptionType.scala:[186..186) in Input.VirtualFile("file://<WORKSPACE>/Day3/OptionType.scala", "//optionalType
val optionalInt: Option[Int] = Some(42)
//usual type
val normal: Int =45

val actualValue:Int= optionalInt match {
  case Some(value) => value
  case None => -1
}

object ")
file://<WORKSPACE>/Day3/OptionType.scala
file://<WORKSPACE>/Day3/OptionType.scala:11: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof