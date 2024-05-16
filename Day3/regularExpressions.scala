val str = "Indian123"
val reg = str match {
 
  case s if s.matches("^[A-Za-z]+$") => "Complete Text"
  case s if s.matches("^[A-Za-z]+[0-9]+$") => "It is alpha numeric"
  case _ => "It is neither Complete Text nor alphanumeric"
}

@main def regularExpression = {
     println(s" Result of the regular Expression is $reg")
     val str = "Indian123"
     if(str.matches("^[A-Za-z]+[0-9]+$")){
        println("Yes it alphanumeric")
     }
}