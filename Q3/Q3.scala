class Account(n:Int) {
  var balance = n ;

  def transfer(that: Account,amount:Int)={
    balance=balance-amount;
    that.balance=that.balance+amount;
  }
}
object Account extends App {
  val x = new Account(3000)
  val y = new Account(1500)
  x.transfer(y,500)
  println(x.balance)
  println(y.balance)
}
