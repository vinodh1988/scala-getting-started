
def process(inputNumbers: Int*): Unit = {
   println(inputNumbers)
   
}

@main def runThis() ={
    process()
    process(1,2)
    process(1,2,3)
}