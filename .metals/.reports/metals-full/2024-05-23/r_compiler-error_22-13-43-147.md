file://<WORKSPACE>/Day9/Flatmap.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition doubledFuture is defined in
  <WORKSPACE>/Day9/Futures.scala
and also in
  <WORKSPACE>/Day9/Futures.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 669
uri: file://<WORKSPACE>/Day9/Flatmap.scala
text:
```scala
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
val resultFuture = fetchData(101).flatMap { data =>
  processData(data)
}

@m@@

// Handle the result
resultFuture.onComplete {
  case Success(result) => println(s"Processed result: $result")
  case Failure(e) => println(s"Error processing data: ${e.getMessage}")
}

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition doubledFuture is defined in
  <WORKSPACE>/Day9/Futures.scala
and also in
  <WORKSPACE>/Day9/Futures.scala
One of these files should be removed from the classpath.