

object matchexpression {

  def main(args: Array[String]) {

    val age = 18 // for strings as case "18"

    age match {

      case 20 => println("Wrong guess")
      case 18 => println("Right")
      case 30 => println("Wrong guess")
      case 40 => println("Wrong guess")
      case 50 => println("Wrong guess")

      case _ => println("You failed")
    }

    val res = age match { // match as expression

      case 20 => age
      case 18 => age
      case 30 => age
      case 40 => age
      case 50 => age

      case _ => "You failed"
    }
    println("Result : " + res)

    val i = 5
    i match {

      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
  }
}