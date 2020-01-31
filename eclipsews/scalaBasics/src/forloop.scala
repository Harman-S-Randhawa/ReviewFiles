

object forloop {

  def main(args: Array[String]) {
    for (i <- 1 to 10) //(i <- 1.to(5)) OR (i <- 1 until 6)
    {
      println(i)
    }
    for (i <- 1 to 9; j <- 1 to 3) {
      println(i, j)
    }

    val list = List(1, 2, 3, 4, 5, 6, 7)
    for (i <- list)
      println("List members: " + i)

    for (i <- list; if i < 6) //Using Filters
    {
      println("Filtered i : " + i)
    }

    val res = for { i <- list
              if i < 6
    } yield //Using for as expression
    {
      i * i
    }
    println("Result is : " + res) //Result is shown in a list
  }
}