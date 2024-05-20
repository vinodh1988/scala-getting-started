import scala.util.Using
import java.io.BufferedReader
import java.io.FileReader
import java.io.File
import scala.util.{Try, Success, Failure}

object executeMain extends App  {
    val result = Using(new BufferedReader(new FileReader(new File("/Users/vinodh/Scala-Getting-Started/Day5/Pizza.scala")))){
       br => br.readLine()
    }

    result match {
     case Success(value) => println( value)
     case Failure(exception) => println("An error occurred: " + exception.getMessage)
   }
}