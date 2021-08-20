class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be 0")

  val num = n
  val denom = d

  override def toString = s"$n/$d"

  def sub(that: Rational): Rational =
    new Rational (num*that.denom-that.num*denom,denom*that.denom)
}
object Ratinal extends App {
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  println(x.sub(y.sub(z)));
}
