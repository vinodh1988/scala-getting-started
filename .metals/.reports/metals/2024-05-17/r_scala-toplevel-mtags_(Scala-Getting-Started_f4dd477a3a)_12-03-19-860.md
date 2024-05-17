error id: file://<WORKSPACE>/Day4/inheritance.scala:[86..87) in Input.VirtualFile("file://<WORKSPACE>/Day4/inheritance.scala", "abstract class Shape(name: String)
{
    def show = println(s" name: $name")
    def 
}

class Rectangle(name: String, length: Int, breadth: Int) extends Shape(name: String)
{
    override def show: Unit = {
        super.show
        println(s"length: $length breadth: $breadth")
    }

    def area = length*breadth
}

@main def runMain = {
  val shape:Shape = new Rectangle("Rectangle" ,20,30) 
  shape.show
}
")
file://<WORKSPACE>/Day4/inheritance.scala
file://<WORKSPACE>/Day4/inheritance.scala:5: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace