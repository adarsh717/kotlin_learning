package higherOrderFunction

fun processNumber(a: Int,calculation:(Int)-> Int){
    var result=calculation(a)
    println(result)
}

fun main(){
    processNumber(5) { it * it }
}