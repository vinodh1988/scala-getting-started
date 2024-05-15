error id: file://<WORKSPACE>/closures.scala:[322..322) in Input.VirtualFile("file://<WORKSPACE>/closures.scala", "def wrapper(outer: Int):Unit = {
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

@main def ")
file://<WORKSPACE>/closures.scala
file://<WORKSPACE>/closures.scala:14: error: expected identifier; obtained eof
@main def 
          ^
#### Short summary: 

expected identifier; obtained eof