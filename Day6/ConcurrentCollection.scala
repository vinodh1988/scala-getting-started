import java.util.concurrent.ConcurrentHashMap
object ConcurrencyHash {

 def main(args: Array[String]) =
  {

    // Create a concurrent hash map
    val map = new ConcurrentHashMap[String, Int]()

    // Insert key-value pairs concurrently
    for (i <- 1 to 10) {
      val key = s"Key$i"
      val value = i * 10
      map.put(key, value)
    }

    // Retrieve and print values concurrently
    map.forEach((k, v) => println(s"Key: $k, Value: $v"))
  }

}