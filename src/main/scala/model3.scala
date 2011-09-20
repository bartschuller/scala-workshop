package com.lunatech.scaladay.model3

case class Person(name: String, address: Option[Address] =
                                         None) {
  override def toString = "%s from %s".format(name,
                           address.getOrElse("the street"))
}

case class Address(m: String, c: String)

object Main extends App {
  val homeless = Person("Bart")
  val happy = homeless.copy(address = Some(Address(
                          "Den Haag", "Holland")))
  happy.address match {
    case None => println("bummer")
    case Some(a) => println("excellent to hear you live at "+a)
  }
}
