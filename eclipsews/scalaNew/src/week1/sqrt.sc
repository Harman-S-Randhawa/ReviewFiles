package week1

object session {

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrItr(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrItr(improve(guess, x), x)             //> sqrItr: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001                //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrItr(1.0, x)            //> sqrt: (x: Double)Double

  sqrt(3)                                         //> res0: Double = 1.7321428571428572
  sqrt(5)                                         //> res1: Double = 2.2360688956433634
}