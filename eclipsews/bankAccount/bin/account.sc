object account {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val acct = new BankAccount                      //> acct  : BankAccount = BankAccount@7f63425a
  acct deposit 50
  acct withdraw 20                                //> res0: Int = 30
  acct withdraw 20                                //> res1: Int = 10
  acct withdraw 15                                //> java.lang.Error: Insufficient funds
                                                  //| 	at BankAccount.withdraw(BankAccount.scala:13)
                                                  //| 	at account$.$anonfun$main$1(account.scala:8)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at account$.main(account.scala:1)
                                                  //| 	at account.main(account.scala)
  }