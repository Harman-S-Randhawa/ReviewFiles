//Maps are collection of key value pairs

object mapScala {
    
    val myMap: Map[Int, String] = 
      Map(101 -> "Afsana", 102 -> "Inder", 103 -> "Harman" )
  
    val myMap2: Map[Int, String] = 
      Map(104 -> "Ekam")
    def main(args: Array[String])
    {
      println(myMap)
      println(myMap(101))
      println(myMap(102))
      println(myMap(103))
      println(myMap.keys)
      println(myMap.values)
      
      myMap.keys.foreach {  key =>
        println("Key : "+ key)
        println("Value : "+myMap(key))
      }
      
      println(myMap.contains(103))
      
      println(myMap ++ myMap2)
      
    }
}