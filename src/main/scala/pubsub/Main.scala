package pubsub

object Main {
  def main(args: Array[String]) {
    val business = new AllBusiness
    val observer = new NosyGuy
    business.subscribe(observer)
    business.boreMe
    business.launch("a space rocket")
  }
}
