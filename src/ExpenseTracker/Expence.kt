package ExpenseTracker

fun main(){
    val em= ExpenseManager()
    em.addExpenses(1,"Salary",5000.60, TransactionType.INCOME)
    em.addExpenses(2,"Food",1500.80, TransactionType.EXPENSE)
    em.addExpenses(3,"Cloths",575.50, TransactionType.EXPENSE)
    em.addExpenses(4,"Freelance",2500.0, TransactionType.INCOME)
    println("Total Income: ${em.getTotalIncome()}")
    println("Total Expense: ${em.getTotalExpense()}")
    println("Remaining: ${em.getBalance()}")
}

data class Expense(
    var id: Int,
    var title: String,
    var amount: Double,
    val type: TransactionType
    )

enum class TransactionType{
    INCOME,
    EXPENSE
}

open class ExpenseManager{
    val transaction=mutableListOf<Expense>()

    fun addExpenses(id: Int,title: String,amount: Double,type: TransactionType){
        transaction.add(Expense(id,title,amount,type))
    }


    fun getTotalIncome(): Double{
        var total=0.0

        for (expense in transaction){
            if (expense.type== TransactionType.INCOME){
                total+=expense.amount
            }
        }
        return total
    }

    fun getTotalExpense(): Double{
        var total=0.0
        for (expense in transaction){
            if (expense.type== TransactionType.EXPENSE){
                total+= expense.amount
            }
        }
        return total
    }
    fun getBalance(): Double{
        var income=getTotalIncome()
        var expense=getTotalExpense()
        return income-expense
    }

}