error id: file://<WORKSPACE>/Day5/ProjectActivity.scala:[562..563) in Input.VirtualFile("file://<WORKSPACE>/Day5/ProjectActivity.scala", "trait CodingActivity
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

class Project extends CodingActivity {
    def
}")
file://<WORKSPACE>/Day5/ProjectActivity.scala
file://<WORKSPACE>/Day5/ProjectActivity.scala:31: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace