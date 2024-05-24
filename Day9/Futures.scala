import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

// Creating a Future that completes successfully
val numberFuture: Future[Int] = Future {
  Thread.sleep(1000) // Simulating some computation
  21
}

// Mapping to transform the result of the Future
val doubledFuture: Future[Int] = numberFuture.map(number => number * 2)
val stringified: Future[String] = numberFuture.map(x=>"Stringified"+x)
@main def main() = {
// Print the result when it's ready
doubledFuture.foreach(result => println(s"Result: $result"))
stringified.foreach(result => println(s"result: $result"))
Thread.sleep(15000)
}