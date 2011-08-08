
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
    "not suck" in {
      val subtotal = 42.0
      subtotal = subtotal * 1.19 // <1>
    }
  }
}
