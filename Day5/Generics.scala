
class Box[T](value: T) {
  def getValue: T = value
}

val intBox = new Box(20) 
val strBox = new Box[String]("hello")

@main def gen = {
    println(intBox.getValue)
    println(strBox.getValue)
}