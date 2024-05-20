import scala.util.{Try, Success, Failure}
@main def runForIt = {
val result: Try[Int] = 
    Try(10 / 0)

   result match {
     case Success(value) => println("Result: " + value)
     case Failure(exception) => println("An error occurred: " + exception.getMessage)
   }
}