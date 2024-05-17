error id: file://<WORKSPACE>/Day4/OperatorOverloading.scala:[198..206) in Input.VirtualFile("file://<WORKSPACE>/Day4/OperatorOverloading.scala", "class Vector(val x: Double, val y: Double) {
  def +(vector2: Vector): Vector = new Vector(this.x + vector2.x, this.y + vector2.y)
  def *(x: Int): Vector = new Vector(this.x*x, this.y*x )
  def 
  override def toString(): String = s"Vector($x,$y)"
}

val v1 = new Vector(1.0, 2.0)
val v2 = new Vector(3.0, 4.0)
val v3 = v1 + v2  // Equivalent to v1.+(v2)
val v4 = v1*5

@main def global() = {
    println(v3)
    println(v4)
}")
file://<WORKSPACE>/Day4/OperatorOverloading.scala
file://<WORKSPACE>/Day4/OperatorOverloading.scala:5: error: expected identifier; obtained override
  override def toString(): String = s"Vector($x,$y)"
  ^
#### Short summary: 

expected identifier; obtained override