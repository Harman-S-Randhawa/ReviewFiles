import Array._

object arrayScala {

  val myArray: Array[Int] = new Array[Int](4)

  val myArray2 = new Array[Int](5)

  val myArray3 = Array(1, 2, 3, 4, 5)

  def main(args: Array[String]) {
    myArray(0) = 20
    myArray(1) = 30
    myArray(2) = 40
    myArray(3) = 50

    for (i <- myArray) {
      println(i)
    }

    for (i <- 0 to (myArray.length - 1)) {
      println(myArray(i))
    }

    for (i <- myArray2) {
      println(i)
    }
    
    println(myArray3.length)
    
    val res = concat(myArray , myArray3)
    for(i <- res)
      {
      println(i)
      }
  }
}