def fun1(a: Int): String = {
    return "Hello "+a
}

def process(a: String): Unit = {
    println("Processing "+a)
}

object mainapp extends App {
println(fun1(20))
process("Roger")
}