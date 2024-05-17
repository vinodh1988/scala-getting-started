object Members {
    private val members: List[String] = List("Ravi","Rahul","Rakesh")

    def printlist = {
        for(x <- members)
           println(x)
    }
}

@main def Runner =  {
    
   Members.printlist
    
}