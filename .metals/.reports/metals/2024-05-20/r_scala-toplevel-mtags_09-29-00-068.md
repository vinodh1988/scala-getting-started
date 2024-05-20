error id: file://<WORKSPACE>/Day5/ProjectActivity.scala:[796..796) in Input.VirtualFile("file://<WORKSPACE>/Day5/ProjectActivity.scala", "trait CodingActivity
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
    def process: Unit = {
        println("This is a template that sets up the code in github")
        println("The build environment is Maven and platform is Java")
        println("The development Enviroment is intellij")
    }
}

@object ")
file://<WORKSPACE>/Day5/ProjectActivity.scala
file://<WORKSPACE>/Day5/ProjectActivity.scala:37: error: expected identifier; obtained eof
@object 
        ^
#### Short summary: 

expected identifier; obtained eof