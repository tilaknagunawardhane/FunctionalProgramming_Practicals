class Account(private var balance: Double) {
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited $$${amount}. Current balance: $$${balance}.")
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount <= balance) {
      balance -= amount
      println(s"Withdrew $$${amount}. Current balance: $$${balance}.")
    } else {
      println(s"Insufficient funds! Withdrawal of $$${amount} failed.")
    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
      println(s"Transferred $$${amount} to the target account.")
    } else {
      println(s"Insufficient funds! Transfer of $$${amount} failed.")
    }
  }

  def checkBalance: Double = balance
}

object Main {
  def main(args: Array[String]): Unit = {
    val accountA = new Account(500.0)
    val accountB = new Account(300.0)

    println(s"Initial balance of Account A: $$${accountA.checkBalance}")
    println(s"Initial balance of Account B: $$${accountB.checkBalance}")

    accountA.deposit(100.0)
    accountA.withdraw(50.0)
    accountA.transfer(200.0, accountB)

    println(s"Final balance of Account A: $$${accountA.checkBalance}")
    println(s"Final balance of Account B: $$${accountB.checkBalance}")
  }
}
