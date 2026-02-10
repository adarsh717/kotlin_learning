fun main(){
    var laptopdetail=Laptop("MacBook",98700)
}
class Laptop(brand: String) {
    var price = 0

    constructor(laptopbrand: String, price: Int) : this(laptopbrand) {
        this.price = price
        println("Full details initialized")

    }
    init {
        println("Laptop brand initialized")
    }
}