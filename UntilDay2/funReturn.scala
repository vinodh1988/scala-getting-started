def giveMeCode(ops:String ): (Int,Int)=>Int = {
ops match {
  case "add" =>  (a,b)=>a+b
  case "mul" =>  (a,b)=>a*b
  case "sub" =>  (a,b)=>a-b
  case _ =>   (a,b)=> -1
}
}

@main def runFun = {
   val result = giveMeCode("mul")(12,35)
   println(s" result of 12 operated with 35 $result")
}