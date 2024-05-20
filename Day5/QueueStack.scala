trait IntQueue {
  def put(x: Int): Unit
  def get(): Int
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int): Unit = super.put(x + 1)
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int): Unit = super.put(2 * x)
}

class BasicIntQueue extends IntQueue {
  private var queue = List.empty[Int]
  def put(x: Int): Unit = { queue = queue :+ x }
  def get(): Int = queue.head
}

@main def runner(): Unit = {
val queue = new BasicIntQueue with Incrementing with Doubling
queue.put(10)  // The value 10 is first doubled to 20, then incremented to 21.
print(queue.get())
}