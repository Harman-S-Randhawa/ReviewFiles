/*Higher order functions area able to take functions 
as arguments and return functions*/

object highOrderFunc {
    
    def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x,y)
    
    def math2(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x,y),z)
    
    def main(args: Array[String])
    {
      val res = math(50, 20, (x,y)=>x min y)    //x+y | x-y | x*y | x/y | x max y
      println(res)
      
      val res2 = math2(50, 20, 70, (x,y)=>x min y)    //x+y | x-y | x*y | x/y | x max y
      println(res2)
      
      val res3 = math(50, 20, _+_)  // _ is wildcard  
      println(res3)
    }
}