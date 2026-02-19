package sealedExample

sealed class PaymentStatus {
    object Pending: PaymentStatus()
    data class Processing(val progress: Int): PaymentStatus()
    data class Success(val transactionId: String): PaymentStatus()
    data class Failed(val error: String): PaymentStatus()
}

fun checkPayment(status: PaymentStatus): String{
    return when(status){
        is PaymentStatus.Pending -> "Transaction is pending!"
        is PaymentStatus.Processing -> "Transaction in processing...${status.progress}%"
        is PaymentStatus.Success -> "Transaction Successful. ID:${status.transactionId}"
        is PaymentStatus.Failed -> "Transaction is failed! ${status.error} "
    }
}

fun main(){
    val a= PaymentStatus.Pending
    println(checkPayment(a))
    val b= PaymentStatus.Processing(57)
    println(checkPayment(b))
    val c= PaymentStatus.Success("7010230102569")
    println(checkPayment(c))
    val d= PaymentStatus.Failed("Server Down")
    println(checkPayment(d))
}