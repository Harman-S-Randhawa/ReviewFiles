

trait Publisher {
    
  private var subscribers: Set[Subscriber] = Set()
  
  def subscribe(subscriber: Subscriber): Unit =
      subscribers += subscribers
      
  def unsubscribe(subscriber: Subscriber): Unit =
    subscribers -= subscribers
    
  def publish(): Int =
      subscribers.foreach(_.handler(this))
}