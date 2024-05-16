class Person(val name: String, var age: Int) {
// Primary constructor
  println("Primary constructor")

// Auxiliary constructor 1
  def this(name: String) = {
    this(name, 0)  // Calls primary constructor
    println("Auxiliary constructor 1")
  }

// Auxiliary constructor 2
  def this() = {
    this("Unknown") 
    this.age =45 // Calls the first auxiliary constructor
    println("Auxiliary constructor 2")
  }

  
   override def toString(): String = s" name : $name age: $age"
}

object ConstrutorMany extends App {
    val sample:Person =new Person()
    println(sample)
}