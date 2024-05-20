trait Pizza
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
    
    
     def billIt: Unit = {
         println("Pay the bill $$$$$")
    }
}

object MainIt extends App {
    val pizzanow: PizzaMaking = new PizzaMaking with MushrooomTopping
    pizzanow.prepare
    val pizzanow2: PizzaMaking = new PizzaMaking with OlivesTopping
    pizzanow2.prepare
    pizzanow2.billIt
}