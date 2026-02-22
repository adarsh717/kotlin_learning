package higherOrderFunction

fun transformList(list: List<Int>,action: (Int)-> Int): List<Int> {
    var result=mutableListOf<Int>()
    for (item in list){
        val newValue=action(item)
        result.add(newValue)
    }
    return result
}
fun main(){
    val li=listOf(1,2,3)
    val op=transformList(li){
        it*2
    }
    println(op)

}