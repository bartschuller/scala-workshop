package pubsub

import collection.mutable.Publisher

class AllBusiness extends FrameworkThing with Publisher[MyEvent] {
  type Pub = AllBusiness

  def launch(how: String) {
    println("launching in the manner of "+how)
  }

  def boreMe {
    println("bored now")
  }
}
