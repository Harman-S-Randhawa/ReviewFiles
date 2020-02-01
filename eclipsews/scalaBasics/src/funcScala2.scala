

object funcScala2 {
  
    object Math {
      def add(x: Int = 45, y: Int = 15): Int = {   //adding default values to function
        return x+y
      }
      def square(x: Int) = x * x
    }
    
    def print(x: Int, y: Int): Unit = {
      println(x+y)
    }
    def main(args: Array[String]) {
      println(Math.add())            //for default no parametres are passed
      println(Math.add(60))          //Updating a default parametre
      print(100,200)                //method does not return any value
      println(Math square 3)
    }
}

//In scala you can define functions with special characters
//e.g - def **(x: Int,y: Int)