//optionalType
val optionalInt: Option[Int] = Some(42)
val second: Option[Int] = None
//usual type
val normal: Int =45

val actualValue:Int= optionalInt match {
  case Some(value) => value
  case None => -1
}

object Runner extends App {
    println(actualValue)
    println(optionalInt.getOrElse(-1))
    println(second.getOrElse(-1))
}