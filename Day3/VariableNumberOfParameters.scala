
def process(inputNumbers: Int*): Unit = {
   println(inputNumbers)
   println("---------------------")
   inputNumbers.foreach(println)
}

@main def runThis() ={
    process()
    process(1,2)
    process(1,2,3)
}