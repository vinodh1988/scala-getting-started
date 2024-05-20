// Define a trait for a vehicle
trait Vehicle {
  def drive(): Unit
}

// Define a trait for a vehicle with an engine
trait Engine {
  def start(): Unit
  def stop(): Unit
}

// Define a trait for a vehicle with a GPS system
trait GPS {
  def navigate(): Unit
}

// Define a trait for a car, which is a vehicle with an engine and GPS
trait Car extends Vehicle with Engine with GPS {
  def drive(): Unit = {
    start()
    println("Driving...")
    navigate()
    stop()
  }
}

// Define a class for a basic car
class BasicCar extends Car {
  def start(): Unit = println("Starting engine...")
  def stop(): Unit = println("Stopping engine...")
  def navigate(): Unit = println("Calculating route and navigating...")
}

// Usage
object Main {
  def main(args: Array[String]): Unit = {
    val basicCar = new BasicCar
    basicCar.drive()
  }
}
