package pubsub

sealed trait MyEvent
case class LaunchEvent(how: String) extends MyEvent
case class BoringEvent() extends MyEvent
