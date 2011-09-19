package com.lunatech.scaladay.model2

trait Named {
  def name: String
}

trait Damned extends Named {
  def damned = name.reverse
}

class Person(val name: String) extends Named with Ordered[Person] {
  def compare(that: Person) = name.compare(that.name)

  override def toString: String = name

  override def equals(that: Any): Boolean = that match {
    case p: Person => name.equals(p.name)
    case _ => false
  }
}

object Person {
  def apply(n: String) = new Person(n)
}
