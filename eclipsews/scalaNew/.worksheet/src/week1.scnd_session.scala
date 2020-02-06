package week1

object scnd_session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(301); 

  def sqrt(x: Double) = {

    def sqrItr(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrItr(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2
      sqrItr(1.0)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(10); val res$0 = 
  sqrt(3);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(5);System.out.println("""res1: Double = """ + $show(res$1))}
}
