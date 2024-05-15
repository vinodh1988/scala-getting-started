val reciprocal: PartialFunction[Double, Double] = {
  case x if x != 0.0 => 1.0 / x
}
@main def doThis() = {
println(reciprocal.isDefinedAt(2.0)) // true
println(reciprocal(2.0))
println(reciprocal.isDefinedAt(0.0)) // false
}