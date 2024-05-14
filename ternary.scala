object Main extends App {
val a = 10
val b = 20
val max = if (a > b) a else b

println(max)  // Output will be 20

val score: Int = 85

val grade = if (score >= 90) {
  "A"
} else if (score >= 80) {
  "B"
} else if (score >= 70) {
  "C"
} else if (score >= 60) {
  "D"
} else {
  "F"
}

println(s"A score of $score results in a grade of $grade.")


}

