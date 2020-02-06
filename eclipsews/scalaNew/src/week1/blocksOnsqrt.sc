package week1

object scnd_session {

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrt(x: Double) = {

    def sqrItr(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrItr(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2
      sqrItr(1.0)
  }                                               //> sqrt: (x: Double)Double
  sqrt(3)                                         //> res0: Double = 1.7321428571428572
  sqrt(5)                                         //> res1: Double = 2.2360688956433634
}