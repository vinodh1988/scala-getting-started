trait Process {
    def doActivity(name: String): Unit
}

class Compile extends Process
{
    def doActivity(name: String): Unit = println(s"Compiling $name")
}


class Document extends Process
{
    def doActivity(name: String): Unit = println(s"Documenting $name")
}

@main  def runTrait() = {
 var task: Process = new Compile("Scala Project")
 task.doActivity()
 task = new Document("Scala project")
 task.doActivity()

}