class Vector(val x: Double, val y: Double) {
  def +(vector2: Vector): Vector = new Vector(this.x + vector2.x, this.y + vector2.y)
}

val v1 = new Vector(1.0, 2.0)
val v2 = new Vector(3.0, 4.0)
val v3 = v1 + v2  // Equivalent to v1.+(v2)

@main def global() = {
    print(v3)
}