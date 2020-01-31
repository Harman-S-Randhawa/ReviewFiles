

object ifelse {

  def main(args: Array[String]) {
    val x = 20
    /* var res = ""

      if(x == 20)
      {
        //println("X is : "+x)
        res = "x==20"
      }
      else
        //println("Please input 20")
        res = "x!=20"

      println(res)
      */
    
    //for Scala 
    
    val res2 = if (x == 20) "X is : " + x else "X is not 20"
    println(res2)
    
    //OR print expression directly
    
    println(if (x == 20) "X is : " + x else "X is not 20")
  }
}