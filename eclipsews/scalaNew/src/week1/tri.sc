package week1

object tri {

		def tri(n: Int): Unit = {
  for (i <- 1 to n)
    for (j <- 1 to i)
			j
}                                                 //> tri: (n: Int)Unit
tri(5)
}