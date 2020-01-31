

object funcScala {
  
      object math {
        def add(x: Int, y: Int): Int ={  //Calling add function from new math object
          return x+y
        }
        def square(x: Int) = x*x
      }
  def add(x: Int, y: Int): Int = { //First way for function declaration
    return x + y
  }

  def subtract(x: Int, y: Int): Int = { //2nd way ffor function declaration
    x - y //Ignore return : Last line of func is return value
  }

  def multiply(x: Int, y: Int): Int = x * y //3rd way ffor function declaration

  def divide(x: Int, y: Int) = x / y //4th way for function declaration
                //
  
  def main(args: Array[String]) {
    println(math square 3)  //for single argument methods
    println(math.add(45, 15))  //math object call (no instance because math is an object)
    println(add(45, 15))
    println(subtract(45, 15))
    println(multiply(45, 15))
    println(divide(45, 15))
  }
}