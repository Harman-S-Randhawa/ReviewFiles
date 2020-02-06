/* currying is technique of transforming a function
 * that takes mulitple arguments into mulitple functions
 * that take single argument
 */

object curryingFunc {

  def add(x: Int, y: Int) = x + y

  def add2(x: Int) = (y: Int) => x + y        //curried

  def add3 (x: Int)(y: Int) = x+y    //simpler format for currying
  
  
  def main(args: Array[String]) {
    println(add(15, 30))
    
    println(add2(25)(45))
    
    val sum40 = add2(30)        //partial implementation
    println(sum40(120))          //for currying
    
    println(add3(100)(170))    
    
    val sum50 = add3(120)_      //partial impl. for simpler
    println(sum50(240))
  }
}