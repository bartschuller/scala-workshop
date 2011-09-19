import org.specs2.mutable._

import com.lunatech.scaladay.model2._

class Model2Spec extends Specification {
  "Person in the second model" should {
    "have a nice toString" in {
      val bart = new Person("Bart")
      bart.toString must_== "Bart"
    }
    "sort and compare correctly" in {
      val people = Seq("Francisco", "Bart", "Frans", "Egor").map(Person(_))
      people.sorted.head should_== Person("Bart")
    }
    "be damnable" in {
      (new Person("Joy") with Damned).damned should_== "yoJ"
    }
  }

}
