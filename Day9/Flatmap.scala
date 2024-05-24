import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

// Simulate a service that fetches data
def fetchData(id: Int): Future[String] = Future {
  println(s"Fetching data for ID: $id")
  Thread.sleep(500) // Simulate delay
  s"Data for $id"
}

// Simulate another service that processes data
def processData(data: String): Future[Int] = Future {
  println(s"Processing data: $data")
  Thread.sleep(500) // Simulate processing time
  data.length // Return the length of data
}

// Chain the Futures using flatMap and map
val resultFuture:Future[Int] = fetchData(101).flatMap { data =>
  processData(data)
}

@main def executable = {

// Handle the result
resultFuture.onComplete {
  case Success(result) => println(s"Processed result: $result")
  case Failure(e) => println(s"Error processing data: ${e.getMessage}")
}
Thread.sleep(10000)
}