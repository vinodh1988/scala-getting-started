@main def firstPro() = {
    val a=20  //automatically type inferred
    var b: Int =30  //proper way of declaring variable with type
    
   // var a=30
    print("First Scala project")
    println(s" A Value is  $a")
    println("Mutable b is $b")
}