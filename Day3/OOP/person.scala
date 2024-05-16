class Person(sno: Int,name: String,city: String) {
    def showIt: Unit = {
        println(s"sno: $sno name: $name city: $city")
    }
   /* def setName(name: str):Unit = {
        this.name=name
    }*/
} //instance variables(property tupes) are not supposed to be accessed outside the class
// they dont have visibility outside

@main def checkPerson = {
    val person1: Person =new Person(1,"Ravi","Chennai")
    val person2: Person =new Person(2,"Rohan","Mumbai")
    person1.showIt
    person2.showIt
    //person1.setName("RAjesh")
    person1.showIt
}