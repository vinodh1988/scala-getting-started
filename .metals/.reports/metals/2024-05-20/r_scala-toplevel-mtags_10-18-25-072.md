error id: file://<WORKSPACE>/Day5/Pizza.scala:[699..700) in Input.VirtualFile("file://<WORKSPACE>/Day5/Pizza.scala", "trait Pizza
{
    def prepare: Unit
}
trait Saucing extends Pizza {
    abstract override def prepare: Unit = {
        super.prepare
        println("Apply As much Sauce as you can")
    }
}

trait OlivesTopping extends Saucing {
    abstract override def prepare: Unit = 
        {   
            super.prepare
            println("Adding Tomato, Onion and Olives Topping")}
}

trait MushrooomTopping extends Saucing {
    abstract override def prepare: Unit = 
        {   
            super.prepare
            println("Adding Tomato, Onion and Mushroom Topping")
        }
}

class PizzaMaking extends Pizza
{
     def prepare: Unit = {

        println("Baking pizza base")
    }
    
    def
}

object MainIt extends App {
    val pizzanow: PizzaMaking = new PizzaMaking with Saucing with MushrooomTopping
    pizzanow.prepare
    val pizzanow2: PizzaMaking = new PizzaMaking with Saucing with OlivesTopping
    pizzanow2.prepare
    pizzanow2.billIt
}")
file://<WORKSPACE>/Day5/Pizza.scala
file://<WORKSPACE>/Day5/Pizza.scala:35: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace