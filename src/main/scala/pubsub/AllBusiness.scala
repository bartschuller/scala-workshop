package pubsub

import collection.mutable.Publisher

class AllBusiness extends FrameworkThing with Publisher[MyEvent] {
  type Pub = AllBusiness

  def launch(how: String) {
    publish(LaunchEvent(how))
    println("launching in the manner of "+how)
  }

  def boreMe {
    publish(BoringEvent())
    println("bored now")
  }
}
