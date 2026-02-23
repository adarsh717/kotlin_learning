package generics

fun main(){
    show(1)
    show("Adarsh")
}
// it can be work for any type of value.
fun <T> show(value:T){
    println(value)
}