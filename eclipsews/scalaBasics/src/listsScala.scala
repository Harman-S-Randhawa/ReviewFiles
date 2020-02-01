

object listsScala {

  val myList: List[Int] = List(1, 2, 3, 4, 5)
  val namesList: List[String] = List("Harman", "Singh", "Randhawa")

  def main(args: Array[String]) {
    println(myList)        //Immutable list
    println(0 :: myList)    // Pre pend
    println(1 :: 55 :: 77 :: Nil)    //Creates new list
    println(namesList)    
    
    println(myList.head)
    println(myList.tail)
    println(namesList.head)
    println(namesList.tail)
    println(namesList.isEmpty)
    println(myList.reverse)
    println(namesList.reverse)
    println(List.fill(5)(2))
    
    myList.foreach(println)    //Iterations
    
    var sum: Int = 0
    myList.foreach(sum += _)
    println(sum)
    
    for(name <- namesList)    //Iterations2
    {
      println(name)
    }
    
    println(namesList(0))
  }
}