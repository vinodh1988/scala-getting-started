error id: file://<WORKSPACE>/callback.scala:[440..440) in Input.VirtualFile("file://<WORKSPACE>/callback.scala", "def bigTaskLibrary(data: String, callback: (String)=> String): Unit= {
    println("Task Started")
    println(s"Processing $data")
    val userp=callback("Process the process $data")
    println(s"Process the $userp that is given by the user")
    val finaldata=callback("Finish")
    if(finaldata=="success")
       println("Wrapping the task")
    else
       println("it seems the user logic has not been done properly")
} 

//User1
def")
file://<WORKSPACE>/callback.scala
file://<WORKSPACE>/callback.scala:14: error: expected identifier; obtained eof
def
   ^
#### Short summary: 

expected identifier; obtained eof