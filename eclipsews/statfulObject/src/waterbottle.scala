

class waterbottle {
  
    var water: Int = 0
    def drinkwater = {
        if(water>0)
        {
            water = water -1
            println("Water LEft in bottle : "+water)
        }
        
        else
        {
            println("Please fill/refill empty bottle")
        }
    }
    
      def fillwater (c: Int) =
      {
          if(water + c > 5)
              water = 5
          else 
              water = water + c
      } 
      override def toString = "Water in bottle: "+ water
}

object watercalc
{
    def main(args: Array[String])
    {
      var w = new waterbottle
      
      w.fillwater(6)
      println(w)
      
      w.drinkwater
      w.drinkwater
      w.drinkwater
      w.drinkwater
      w.drinkwater
      w.drinkwater
    }
}