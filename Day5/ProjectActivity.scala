trait CodingActivity
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
        super.process
        super.testIt
        println("Deployin the project in the project environment")
    }

}

class Project(name: String) extends CodingActivity {
    
    def process: Unit = {
        println(s" Project: $name")
        println("This is a template that sets up the code in github")
        println("The build environment is Maven and platform is Java")
        println("The development Enviroment is intellij")
    }
}

@main def runTheTraitCompletely  ={
    val project:Project = new Project("Scala API Project") with Building with Deploy
    project.process

}