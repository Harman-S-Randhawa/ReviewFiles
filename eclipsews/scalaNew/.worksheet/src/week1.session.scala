package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(126); 

  def sqrItr(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrItr(improve(guess, x), x);System.out.println("""sqrItr: (guess: Double, x: Double)Double""");$skip(83); 

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(71); 

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(40); 

  def sqrt(x: Double) = sqrItr(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 

  sqrt(3);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(5);System.out.println("""res1: Double = """ + $show(res$1))}
}
