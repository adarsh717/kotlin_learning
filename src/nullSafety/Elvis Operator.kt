package nullSafety

var country: String?=null
fun main(){
    println(country?:"Country not set")
}