

object simulation {
  def main(args: Array[String])
  {
    trait Simulation{
      def currentTime: Int = ???
      def afterDelay(delay: Int)(block: =>Unit): Unit = ???
      def run(): Unit = ???
    }
  }
}