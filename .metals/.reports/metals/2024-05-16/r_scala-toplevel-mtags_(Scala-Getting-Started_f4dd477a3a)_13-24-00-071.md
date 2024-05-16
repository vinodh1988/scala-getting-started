error id: file://<WORKSPACE>/Day3/OOP/auxilary.scala:[411..411) in Input.VirtualFile("file://<WORKSPACE>/Day3/OOP/auxilary.scala", "class Person(val name: String, var age: Int) {
// Primary constructor
  println("Primary constructor")

// Auxiliary constructor 1
  def this(name: String) = {
    this(name, 0)  // Calls primary constructor
    println("Auxiliary constructor 1")
  }

// Auxiliary constructor 2
  def this() = {
    this("Unknown")  // Calls the first auxiliary constructor
    println("Auxiliary constructor 2")
  }
}

object ")
file://<WORKSPACE>/Day3/OOP/auxilary.scala
file://<WORKSPACE>/Day3/OOP/auxilary.scala:18: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof