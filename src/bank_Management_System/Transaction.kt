package bank_Management_System

fun main(){
//    val t1= Transaction("Deposite",5000.0,3000.0)
//    println(t1)
//    val (type,amount,balance)=t1
//    println("Type: $type")
//    println("Amount: $amount")
//    println("Remaining Balance: $balance")
//    val acc= Account(101,1000.0)
//    acc.deposit(1000.0)
//    acc.displayBalance()
//    acc.withdraw(500.0)
//    acc.displayBalance()
//    acc.showTransaction()
//    val ac= SavingAccount(102,1000.0,500.0)
//    ac.withdraw(700.0)
    val ca= CurrentAccount(105,5000.0)
    ca.displayBalance()
    ca.deposit(1000.0)
    ca.displayBalance()
    ca.showTransaction()
}
data class Transaction(
    val type: String,
    val amount: Double,
    val remainingBalance: Double
    )

open class Account(
    val accountNumber: Int,
    var balance: Double
){
    val transaction=mutableListOf<Transaction>()

    fun deposit(amount: Double){
        balance+=amount
        transaction.add(Transaction("Deposit", amount,balance))
        println("Deposited: $amount")
    }

    open fun withdraw(amount: Double){
        if (amount<=balance){
            balance-=amount
            transaction.add(Transaction("Withdraw",amount,balance))
            println("Debit amount: $amount")
        }
        else{
            println("Insufficient balance")
        }
    }

    fun displayBalance(){
        println("Current Balance: $balance")
    }

    fun showTransaction(){
        for (t in transaction){
            println(t)
        }
    }

    fun printLastTransaction(){
        if (transaction.size==0){
            println("No transaction yet")
        }
        else{
            transaction.last()
        }
    }
}

class SavingAccount(accountNumber: Int,balance: Double,val minimumBalance: Double): Account(accountNumber,balance){
    override fun withdraw(amount: Double){
        if (amount-balance>=minimumBalance){
            super.withdraw(amount)
        }
        else{
            println("Cannot withdraw. Minimum balance required $minimumBalance")
        }
    }
}

class CurrentAccount(accountNumber: Int,balance: Double): Account(accountNumber,balance){
    override fun withdraw(amount: Double) {
        println("Processing current account withdrawal")
        super.withdraw(amount)
    }
}
