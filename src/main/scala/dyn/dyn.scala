package dyn

// Compile this with scala 2.9.x and an extra option:
// scalac -Xexperimental dyn.scala

/**
 * Example to show off the Dynamic trait.
 *
 * Create an instance, call methods on it (the methods return this
 * so you can chain calls), then call result.
 **/
class ListBuilder extends Dynamic {
  private var res = List[String]()
  def applyDynamic(method: String)(args: Any*) = {
    val argString = if (args.length>0) "(" + args.mkString(" ") + ")" else ""
    res = method + argString :: res
    this
  }
  def result = res.reverse
}

object ListBuilder {
  def main(args: Array[String]) {
    val lb = new ListBuilder

    lb.any.method("with", 100, "parameters").you.like

    println(lb.result)
    // List(any, method(with 100 parameters), you, like)
  }
}
