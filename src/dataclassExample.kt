fun main(){
    val prod1=Product("Milk",50.0,2)
    println(prod1)
    val prod2=prod1.copy(quantity = 5)
    println(prod2)
}
data class  Product(var productname: String,var price: Double,var quantity:Int)

