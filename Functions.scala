/* 
   In scala , functions are first class citizens?

   Functions can be created independtally without associating with any classes
   it can be assigned to variables - Lambda form
   it can be used as parameter  - Higher order functions
   it can be used as return types to other functions - higher order functions
   it can be nested - closures
 */

 def sayHi(): Unit = {
    println(s"Everything is good and Hi")
 }

 val greet:()=>Unit = sayHi

 object Run extends App {
   println(greet())
 }