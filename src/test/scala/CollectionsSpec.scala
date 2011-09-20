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
}
