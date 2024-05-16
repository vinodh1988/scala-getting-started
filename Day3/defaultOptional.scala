// Function with default parameter
def greet(name: String = "Guest"): Unit = {
  println(s"Hello, $name!")
}
  // Function with optional parameter
def greetWithPrefix(name: String, prefix: Option[String] = None): Unit = {
  val message = prefix match {
    case Some(p) => s"$p, $name!"
    case None => s"Hello, $name!"
  }
  println(message)
}




@main def runMain() = {
// Calling the function without providing the name argument
greet() // Output: Hello, Guest!

// Calling the function with a specific name
greet("Alice") // Output: Hello, Alice!

// Calling the function with both name and prefix
greetWithPrefix("Bob", Some("Hi")) // Output: Hi, Bob!

// Calling the function with only the name
greetWithPrefix("Charlie") // Output: Hello, Charlie!
}

