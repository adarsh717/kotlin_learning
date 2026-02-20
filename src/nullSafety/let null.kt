package nullSafety

var myName: String?="Adarsh"
fun main(){
    myName?.let {
        println(it.length)
    }
}