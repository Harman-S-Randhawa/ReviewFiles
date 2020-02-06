package week1

object gcd {
 	def gcd(a: Int, b: Int): Int =
 		if(b==0) a else gcd(b, a%b)       //> gcd: (a: Int, b: Int)Int

gcd(5,7)                                          //> res0: Int = 1

}