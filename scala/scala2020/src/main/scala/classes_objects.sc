class Rational_1(n: Int, d: Int) {
  require(d!=0, "Denominator can't be zero")
  override def toString = n + "/" + d
}
val half = new Rational_1(1,2)

class Add(a:Int, b:Int) {

}
val a = new Add(3,4)
