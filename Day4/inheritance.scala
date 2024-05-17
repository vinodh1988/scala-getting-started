abstract class Shape(name: String)
{
    def show = println(s" name: $name")
    def area : ()=> Int
}

class Rectangle(name: String, length: Int, breadth: Int) extends Shape(name: String)
{
    override def show: Unit = {
        super.show
        println(s"length: $length breadth: $breadth")
    }

    override def area = () => length*breadth
}

@main def runMain = {
  val shape:Shape = new Rectangle("Rectangle" ,20,30) 
  shape.show
  println(shape.area())
}
