package higherOrderFunction

var names=listOf("Adarsh","Amit","Vikas","Om","Rohit","Raj","Ramu")

fun main(){
    var newName=names.filter { it.length>4 }
    println(newName)
}