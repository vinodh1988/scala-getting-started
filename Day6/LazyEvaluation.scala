object LazyEvaluationExample extends App {
  // Define a lazy value
  lazy val expensiveOperation: Int = {
    println("Computing expensive operation...")
    // Simulate an expensive computation
    Thread.sleep(10000) // Sleep for 2 seconds
    42 // Return a value
  }

  // Main program
  println("Before accessing lazy value")
  println(expensiveOperation) // Access the lazy value
  println("After accessing lazy value")
}
