def fun1(a: Int): String = {
    return "Hello "+a
}

def process(a: String): Unit = {
    println("Processing "+a)
}

object mainapp extends App {
println(fun1(20))
process("Roger")
val blockResult = {
    val a=fun1(20)
    val b=fun1(30)
    a+b
} //block assigned to a variable
println(s"Block result is $blockResult")
}