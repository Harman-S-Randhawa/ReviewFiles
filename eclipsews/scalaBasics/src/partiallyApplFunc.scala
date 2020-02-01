

object partiallyApplFunc {
  
    def main(args: Array[String])
    {
      val sum = (a: Int, b: Int, c: Int) => a + b + c
      
      val f = sum(10,20, _:Int)
      
        val k = sum(10, _:Int, _:Int)
        
      println(sum(10,20,30))    
          println(f(50))        //Paritally applied function
              println(k(100,200))  //Partially applied function
      
    }
}