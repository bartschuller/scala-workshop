import org.specs2.mutable._

import com.lunatech.scaladay.model1._

class Model1Spec extends Specification {
  "Person in the first model" should {
    "have a nice toString" in {
      val bart = createBart
      bart.toString must_== "Bart from Rotterdam"
    }
    "be movable" in {
      val bart = createBart
      bart.move(new Address("Oudemansstraat", "Den Haag", "The Netherlands"))
      bart.toString must_== "Bart from Den Haag"
    }
  }
  def createBart = new Person("Bart", new Address("Heemraadssingel 70", "Rotterdam", "Holland"))

  "The Person object" should {
    "allow construction and other stuff" in {
      val bart = Person("Bart", Address("Oudemansstraat", "Den Haag", "The Netherlands"))
      val paco = Person("Francisco", Address("Zuid", "Rotterdam", "Holland"))
      Person.total should_== 2
      Person.swapHomes(bart, paco)
      bart.address.municipality should_== "Rotterdam"
    }
  }
}
