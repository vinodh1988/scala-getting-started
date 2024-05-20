trait SparePart {
    def partname: String
    def produce: Unit
}

class Product(productname: String, pname: String) extends SparePart
{
    def partname: String = pname
    def produce:Unit = {
       println(s"Producing the product $productname with spart Part $partname")
    }
}

@main def runIt = {
   val obj: Product = new Product("Vehicle","Wheel")
   obj.produce
}