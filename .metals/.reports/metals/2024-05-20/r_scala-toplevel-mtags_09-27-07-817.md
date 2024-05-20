error id: file://<WORKSPACE>/Day5/ProjectActivity.scala:[521..521) in Input.VirtualFile("file://<WORKSPACE>/Day5/ProjectActivity.scala", "trait CodingActivity
{
    def process: Unit
}



trait Building extends CodingActivity
{
    abstract override def process: Unit ={
         super.process
         println("Building the Project") 
    }
}

trait Test  {
   def testIt:Unit = println("Getting the code from the repository and Testing it")
}

trait Deploy extends Building  with Test {
    abstract override def process: Unit = {
        super.testIt
        super.process
        println("Deployin the project in the project environment")
    }

}

class ")
file://<WORKSPACE>/Day5/ProjectActivity.scala
file://<WORKSPACE>/Day5/ProjectActivity.scala:29: error: expected identifier; obtained eof
class 
      ^
#### Short summary: 

expected identifier; obtained eof