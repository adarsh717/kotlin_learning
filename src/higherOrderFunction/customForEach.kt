package higherOrderFunction

fun applyToList(list:List<Int>,action: (Int)->Unit){
    for (list in list){
        action(list)
    }
}
fun main(){
    val list=listOf(1,2,3,4,5)
    applyToList(list){
        print(it)
    }
}