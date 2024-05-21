
import java.util.concurrent._
object ThreadPool {

  def main(args: Array[String]) = {

    // Create a thread pool with fixed number of threads
    val pool: ExecutorService = Executors.newFixedThreadPool(4)

    // Submit tasks to the thread pool
    for (i <- 1 to 10) {
      pool.submit(new Runnable {
        def run(): Unit = {
          println(s"Executing task $i on thread ${Thread.currentThread().getName}")
        }
      })
    }

    // Shutdown the thread pool after tasks are complete
    pool.shutdown()
  }
}
