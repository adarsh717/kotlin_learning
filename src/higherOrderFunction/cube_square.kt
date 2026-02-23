package higherOrderFunction

fun calculation(a: Int,opr:(Int)-> Int): Int {
    return opr(a)
}
fun main(){
    println("Square: ${calculation(5,{it*it})}")
    println("Cube: ${calculation(2,{it*it*it})}")
}