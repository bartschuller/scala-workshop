import org.specs2.mutable._

class CollectionsSpec extends Specification {
  "Lists" should {
    "Be constructable in various ways" in {
      val l1 = List(1, 2, 3)
      val l2 = 2 :: 3 :: Nil
      val l3 = 1 :: l2
      l1 should_== l3
      val a1 = Array(1, 2, 3)
      val l4 = a1.toList
      l1 should_== l4
    }
    "Allow matching" in {
      def listLen[T](l: List[T]): Int =
        l match {
          case x :: xs => 1 + listLen(xs)
          case _ => 0
        }
      listLen(List(1, 2, 3)) should_== 3
    }
  }
  "Vectors" should {
    "Allow append, prepend, indexing" in {
      val v1 = Vector(1, 2, 3)
      val v2 = Vector(4, 5, 6)
      val v3 = v1 ++ v2
      val v4 = v2 :+ 7
      val v5 = 0 +: v1
      v4(2) should_== 6      
    }
  }
  "Maps" should {
    "be easy" in {
      val fruit = Map("Apple" -> "green",
                      "Banana" -> "yellow",
                      "Strawberry" -> "red")

      fruit.get("Pear") should beNone
      fruit.get("Banana") should beSome("yellow")
      fruit("Apple") should_== "green"
      // fruit("Pear") gives NoSuchElementException

      val fruitier = fruit + ("Pear" -> "green")
      fruitier("Pear") should_== "green"
    }
  }
}
