trait Painter {
  def medium: String
  def paint(): Unit = println(s"I paint with $medium.")
}

class OilPainter extends Painter {
def medium: String = "oil paints"
override def paint(): Unit =println(s" oil painting is done with $medium")
}

class WatercolorPainter extends Painter {
def medium: String = "watercolors"
}

@main def goForIt(): Unit = {
val oil = new OilPainter
oil.paint()  // Outputs: I paint with oil paints.

val watercolor = new WatercolorPainter
watercolor.paint()  // Outputs: I paint with watercolors.

}