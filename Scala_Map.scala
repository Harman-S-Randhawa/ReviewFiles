// Scala map program of  
// Accessing Values Using Keys 
  
// Creating object  
object Map_pra
{ 
    // Main method 
    def main(args:Array[String]) 
    { 
  
        val mapIm = Map("Inder" -> 30,  
                        "Afsana" -> 20, 
                        "Guneev" -> 50) 
  
        // Accessing score of Inder 
        val Inder = mapIm("Inder")  
        println(Inder) 
    } 
}  
