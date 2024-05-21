  // Define a lazy value
  def expensiveOperation: Unit = {
    println("Computing expensive operation...")
    // Simulate an expensive computation
    Thread.sleep(10000) // Sleep for 2 seconds
    println(42) // Return a value
  }


  @main def run = {
  // Main program
  println("Before accessing lazy value")
  expensiveOperation 
  println("After accessing lazy value")
  }