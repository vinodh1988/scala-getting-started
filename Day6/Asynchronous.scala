import scala.util.{Success,Failure}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Store  {

  def main(args: Array[String]) = {


    val futureResult: Future[Int] = Future {
      // Perform asynchronous computation
      Thread.sleep(1000)
      42
    }

    futureResult.onComplete {
      case Success(result) => println(s"Result: $result")
      case Failure(exception) => println(s"An error occurred: $exception")
    }

    println("Future Demonstration.....")
    Thread.sleep(10000)
  }

}