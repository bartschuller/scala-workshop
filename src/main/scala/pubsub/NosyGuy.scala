package pubsub

import collection.mutable.Subscriber


class NosyGuy extends Subscriber[MyEvent, AllBusiness] {
  def notify(pub: AllBusiness, event: MyEvent) { event match {
    case BoringEvent() => println("booring")
    case LaunchEvent(how) => println("Launching "+how)
  }}
}
