error id: file://<WORKSPACE>/Day3/OOP/companion.scala:[356..357) in Input.VirtualFile("file://<WORKSPACE>/Day3/OOP/companion.scala", "class Person(sno: Int,name: String,city: String) {
    def showIt: Unit = {
        println(s"sno: $sno name: $name city: $city")
    }
   /* def setName(name: str):Unit = {
        this.name=name
    }*/
} //instance variables(property tupes) are not supposed to be accessed outside the class
// they dont have visibility outside
object Person {
    def 
}
@main def checkPerson = {
    val person1: Person =new Person(1,"Ravi","Chennai")
    val person2: Person =new Person(2,"Rohan","Mumbai")
    person1.showIt
    person2.showIt
    //person1.setName("RAjesh")
    person1.showIt
}")
file://<WORKSPACE>/Day3/OOP/companion.scala
file://<WORKSPACE>/Day3/OOP/companion.scala:12: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace