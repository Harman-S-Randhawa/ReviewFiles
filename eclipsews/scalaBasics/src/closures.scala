/* a closure is a function which uses one or more
 * variables declared outside this function
 */

object closures {

  var number = 10
  
  val add = (x: Int) => 
    {
      number = x + number
      number
    }

  def main(args: Array[String]) {
    number=100                        //closure takes most recent state of variable
    
    println(add(20))
    println(number)
  }
}

/* Impure closure is whenever datatype
of 'number' is "var"
		Whenever datatype is "val" means we cannot 
* change value of the 'number' i.i it is pure
*/