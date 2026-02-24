package generics

fun <T,U>anyType(value1: T, value2:U){
    println(value1)
    println(value2)
}

fun main(){
    anyType("Adarsh",5)
}