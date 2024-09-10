class Account(private var balance: Double) {
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount <= balance) {
      balance -= amount
    } else {
      println(s"Insufficient funds! Withdrawal of $$${amount} failed.")
    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
    } else {
      println(s"Insufficient funds! Transfer of $$${amount} failed.")
    }
  }

  def checkBalance: Double = balance

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05
    } else if (balance < 0) {
      balance += balance * 0.1
    }
  }

  override def toString: String = s"Account Balance: $$${balance}"
}

object Bank {
  def accountsWithNegativeBalance(accounts: List[Account]): List[Account] = {
    accounts.filter(_.checkBalance < 0)
  }

  def totalBalance(accounts: List[Account]): Double = {
    accounts.map(_.checkBalance).sum
  }

  def applyInterestToAll(accounts: List[Account]): List[Account] = {
    accounts.foreach(_.applyInterest())
    accounts
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(500.0)
    val account2 = new Account(-200.0)
    val account3 = new Account(1000.0)
    val account4 = new Account(-50.0)

    val bank = List(account1, account2, account3, account4)

    println("Accounts with Negative Balance:")
    Bank.accountsWithNegativeBalance(bank).foreach(println)

    println(s"Total Balance of All Accounts: $$${Bank.totalBalance(bank)}")

    println("Applying Interest to All Accounts...")
    Bank.applyInterestToAll(bank).foreach(println)

    println(s"Final Total Balance of All Accounts: $$${Bank.totalBalance(bank)}")
  }
}
