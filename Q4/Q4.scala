class Account (n:Double,x:String) extends Bank {
  var balance = n.toDouble;
  val name =x;

  def isnegative :Boolean = {
    if(balance < 0) {
      return true
    }
    false
  }
  def interest() ={
    if(isnegative){
      balance= balance-(balance*0.1)
    }
    else{
      balance=balance+(balance*0.05)
    }
  }
}
object Account {
  val acc:Array[Account] = new Array[Account](8);
  acc(1)= new Account(5000.00,"acc1")
  acc(2)= new Account((-2000.00),"acc2")
  acc(3)= new Account(1500.00,"acc3")
  acc(4)= new Account((-1000.00),"acc4")
  acc(5)= new Account(4000.00,"acc5")
  acc(6)= new Account(2000.00,"acc6")
  acc(7)= new Account((-500.00),"acc7")
}
class Bank{
  import Account._
  def negativeList = {
    var i=1;
    println("Negative Accounts List: ")
    for(i<- 1 to 7){
      if(acc(i).isnegative){
        println(acc(i).name);
      }
    }
  }

  def sum ={
    var i=1
    var x=0.toDouble

    for(i<- 1 to 7){
      x=x+acc(i).balance
    }
    println("Sum of all account balances = " + "%.2f".format(x) )
  }

  def balanceafterInterest={
    var i=1
    for(i<- 1 to 7){
      acc(i).interest()
    }
  }
}
object Bank extends App {

  val bank = new Bank
  bank.negativeList
  bank.sum
  bank.balanceafterInterest
  bank.sum
}
