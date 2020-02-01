

object map_and_filter {

  val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val myMap = Map(101 -> "Harman", 102 -> "Afsana", 103 -> "Inder")

  def main(args: Array[String]) {
    println(myList.map(_ * 2))
    println(myList.map(x => "Hi: "+ x * 2))
    println(myList.map(x => "Hi: "*x))
    
    println(myMap.map(x => "Hi: "+x))
    println(myMap.mapValues(x => "Hi: "+x))
    
    println("Hello".map(_.toUpper)) 
    
    println(List(List(1,2,3),List(3,4,5)).flatten)
    
    println(myList.flatMap(x => List(x, x+1)))        //Flattens map method
    
    println(myList.filter(x => x%2==0))
  }
}