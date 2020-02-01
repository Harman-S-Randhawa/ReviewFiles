//Sets are collection of different elements of sdame dataype
//All values in sets should be unique i.e. no duplicate values

object setScala {

  val mySet: Set[Int] = Set(1, 2, 3, 4, 4, 5, 5, 6, 7, 8)

  val mySet2: Set[Int] = Set(9, 10, 11, 12, 12, 13, 13, 14, 15, 16)

  val namesSet: Set[String] = Set("Harman", "Set", "Randhawa")

  def main(args: Array[String]) {
    println(mySet)
    println(mySet + 10)
    println(mySet(8)) //(8) is not index but finding '8' in set
    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)
    
    println(mySet ++ mySet2)          //Concatination
    println(mySet.++(mySet2))
    
    println(mySet.&(mySet2))          //Intersection
    println(mySet.intersect(mySet2))

  }
}