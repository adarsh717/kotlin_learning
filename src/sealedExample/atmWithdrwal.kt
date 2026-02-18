package sealedExample

sealed class AtmWithdraw{
   data class Success(val amount: Int): AtmWithdraw()
   data class Failed(val reason: String): AtmWithdraw()
}

fun withdraw(balance: Int, withdrawAmount: Int): AtmWithdraw {

    return if (withdrawAmount<=balance){
        AtmWithdraw.Success(withdrawAmount)
    }else{
        AtmWithdraw.Failed("Transaction failed")
    }
}

fun main(){
    val result=withdraw(5000,500)
    when(result){
        is AtmWithdraw.Success -> println("Withdraw: ${result.amount}")
        is AtmWithdraw.Failed -> println("Transaction failed: ${result.reason}")
    }
}
