

object funcScala2 {
  
    object Math {
      def add(x: Int = 45, y: Int = 15): Int = {   //adding default values to function
        return x+y
      }
      def square(x: Int) = x * x
    }
    
    def main(args: Array[String]) {
      println(Math.add())            //for default no parametres are passed
        println(Math square 3)
    }
}