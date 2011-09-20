
object Functions extends App {
  val s = 1 to 100
  s.filter(_ % 2 == 1).map(x => "%s is odd".format(x)).take(3).foreach { s =>
    println(s)
  }
  
  val sum: (Int, Int) => Int = (a: Int, b: Int) => a+b

  def combine(a: Int, b: Int, f: Function2[Int, Int, Int]) =
    f(a, b)
  
  println(combine(1,4,sum))
  
  def product(x: Int, y: Int) = x*y
  
  println(combine(2,5,product))
}
