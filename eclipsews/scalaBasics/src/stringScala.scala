

object stringScala {

  val str1: String = "Pratice Session"
  val str2: String = " Is in continuation"

  val num1 = 75
  val num2 = 100.25

  def main(args: Array[String]) {
    println(str1.length()) //to find length of string

    println(str1.concat(str2)) //to concatinate 2 strings
    println(str1 + str2) // ""   ""    ""    ""
    
    val res = printf("(%d -- %.2f -- %s)",num1, num2, str1)   
    println(res)        //() in result because there is no return type
    println("(%d -- %.2f -- %s)".format(num1,num2,str1))
  }
}