class Meter(val value: Double) extends AnyVal

object Demo {
  val m = new Meter(1d)
  println(m)
}
