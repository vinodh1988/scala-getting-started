class Task(name: String) {
  def doSomething(): Unit = {
    // method implementation
    println(s"Do $name in a good way")
  }
}

object Task {
  def apply(name: String)(block: => Unit): Task = {
    val task = new Task(name)
    block // Execute the block
    task
  }
}

@main def MainRunner(): Unit = {
val myTask = Task("Coding Task") {
  println("This code block is executed immediately inside the apply method.")
}
myTask.doSomething()
}