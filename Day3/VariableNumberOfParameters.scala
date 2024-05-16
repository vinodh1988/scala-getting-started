
def process(inputNumbers: Int*): Int = {
   println(inputNumbers)
   return 10
}

@main def runThis() ={
    process()
    process(1,2)
    process(1,2,3)
}