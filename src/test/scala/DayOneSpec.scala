
import org.specs2.mutable._

class DayOneSpec extends Specification {
  "Semicolon inference" should {
    "work for the normal case" in {
      var a = 1
      a must_== 1
    }
    "trip you up if you're not careful" in {
      var a = 1 + 1 + 1
              + 1
      a must_== 3
    }
    "be safe if you end continued lines with an operator" in {
      var a = 1 + 1 + 1 +
              1
      a must_== 4
    }
  }
  "Vals" should {
    "be easy" in {
      val subtotal = 42.0
      val tax = 1.19
      val fees = 10
      val total = subtotal*tax + fees

      val payMe = "Please pay us " + total + " promptly."

      payMe must_== "Please pay us 59.98 promptly."
    }
  }
  "Exceptions" should {
    "be caught" in {
      val x = List(1, 2)
      try {
        x.tail.tail.head
        failure("Should have thrown")
      } catch {
        case _: NoSuchElementException => success
        case e => failure("Unecpectedly got "+e.toString)
      }
    }
  }
}
