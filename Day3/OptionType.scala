//optionalType
val optionalInt: Option[Int] = Some(42)
//usual type
val normal: Int =45

val actualValue:Int= optionalInt match {
  case Some(value) => value
  case None => -1
}