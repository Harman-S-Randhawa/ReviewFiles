//Tuples can contain values of different data types i.i. Heterogeneous
//Tuples are immutable
//Tuples can only store up-to 22 values

object tuplesScala {
  
  val myTuple = (1,2,"Harman", false)
  val myTuple2 = new Tuple4(1,2,"Afsana", false)      //Declare number of elements with "Tuple"
  val myTuple3 = new Tuple3(3,"Inder", (2,3))
  def main(args: Array[String])
    {
      println(myTuple)
      println(myTuple._3)
      println(myTuple2._3)
      println(myTuple3._2)
      println(myTuple3._3._2)
      
      
      myTuple.productIterator.foreach{          //Iterations on tuple
          i => println(i)
      }
      
      println(1 -> "Singh")        //Only valid for 2 values
    }
}