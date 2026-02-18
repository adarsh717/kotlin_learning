package sealedExample

sealed class OrderStatus{
    object Placed : OrderStatus()
    object Preparing : OrderStatus()
    object OutForDelivery : OrderStatus()
    object Delivered : OrderStatus()
    data class Cancelled(val reason : String): OrderStatus()
}

fun trackOrder(status: OrderStatus){
    when(status){
        is OrderStatus.Placed->{
            println("Order has been placed.")
        }
        is OrderStatus.Preparing -> {
            println("Restaurant is preparing your order.")
        }
        is OrderStatus.OutForDelivery -> {
            println("Delivery boy is on the way.")
        }
        is OrderStatus.Delivered -> {
            println("Order is delivered")
        }
        is OrderStatus.Cancelled -> {
            println("Order cancelled: ${status.reason}")
        }
    }
}

fun main(){
    val order1= OrderStatus.Cancelled("Restaurant closed")
    trackOrder(order1)

}