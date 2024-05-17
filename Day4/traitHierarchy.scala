trait Painter {
  def medium: String
  def paint(): Unit = println(s"I paint with $medium.")
}

class OilPainter extends Painter {
  def medium: String = "oil paints"
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