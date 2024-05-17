class Task {
  def doSomething(): Unit = {
    // method implementation
    println("Do it good")
  }
}

object Task {
  def apply(block: => Unit): Task = {
    val task = new Task()
    block // Execute the block
    task
  }
}

@main def MainRunner(): Unit = {
val myTask = Task {
  println("This code block is executed immediately inside the apply method.")
}
myTask.doSomething()
}