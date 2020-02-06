package week1

object gcd {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
 	def gcd(a: Int, b: Int): Int =
 		if(b==0) a else gcd(b, a%b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(10); val res$0 = 

gcd(5,7);System.out.println("""res0: Int = """ + $show(res$0))}

}
