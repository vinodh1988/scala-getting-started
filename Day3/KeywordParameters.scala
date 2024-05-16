def processThings(task:String, input: String):Unit ={
    println(s"processing $task and input is $input")
}

object KeywordRunner extends App {
  processThings(input="Student Records", task="Refining the studens data")
}