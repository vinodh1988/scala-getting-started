def process(input: Any): String = input match {
  case s: String => s"String of length ${s.length}"
  case i: Int => s"Integer square is ${i * i}"
  case _ => "Unknown type"
}

@main def doIt() = {
val number = 3
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}
println(process("Naresh"))
println(process(23))
}