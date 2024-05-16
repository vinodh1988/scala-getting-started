def wrapper(outer: Int):Unit = {
var outerscope=outer
    def inner(data: Int): String = {
        //outer=outer+20
        outerscope=outerscope+data
        println(s"inside inner data is $data and outerscope data is $outerscope")
        return "InnerFinished"
    }
   inner(30)
   inner(40)
   inner(50)
}

@main def Closure: Unit = {
    wrapper(100)
}