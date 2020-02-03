//Evaluation strategy:  delays the evaluation of an expression
//till it's value is needed

class strict {
  val e = {
    println("Strict")
    9
  }
}

class alpha {
  lazy val l = {
    println("Lazy")
    4
  }
}
object lazyEval {

  def main(args: Array[String]) {
    val x = new strict
    val y = new alpha

    println(x.e)
    println(y.l)
  }
}