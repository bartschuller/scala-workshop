package com.lunatech.scaladay.model1

class Person(val name: String, var address: Address) {
  var moved = false
  override def toString = "%s from %s".format(name,
                   address.municipality)
  def move(newAddress: Address) {
    address = newAddress
    moved = true
  }
}

object Person {
  private var peopleCount = 0
  def total = peopleCount
  def apply(name: String, address: Address) = {
    peopleCount += 1
    new Person(name, address)
  }

  def swapHomes(a: Person, b: Person) {
    val aHome = a.address
    a.address = b.address
    b.address = aHome
  }
}

class Address(val municipality: String, val country: String) {
    override def toString = "%s, %s".format(municipality, country)
}

object Address {
  def apply(m: String, c: String) = new Address(m, c)
}
