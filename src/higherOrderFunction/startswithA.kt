package higherOrderFunction

var nameList=listOf("Adarsh","Vikas","Ankit","Rahul","Aman")
fun main(){
    var newList=nameList.filter { it.startsWith("A") }
    println(newList)
}