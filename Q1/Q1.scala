class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be 0")

  val num = n
  val denom = d

  override def toString = s"$n/$d"

  def neg = new Rational (-num,denom)
}
object Ratinal extends App {
  val x = new Rational(1,2)
  println(x.neg);
}
