//Implementation of partially applied functions

import java.util.Date

object logmethod {
  
    def log(date: Date, message: String) =
    {
      println(date+" : " +message) 
    }
    
    def main(args: Array[String])
    {
      val date = new Date
      val newLog = log(date, _:String)
      
      newLog("1st Message")
      newLog("2nd Message")
      newLog("3rd Message")
      newLog("4th Message")
    }
}