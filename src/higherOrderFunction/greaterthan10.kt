package higherOrderFunction

var list=listOf(1,5,7,9,12,15,16,17,20)
fun main(){
    var newlist=list.filter { it>10 }
    print(newlist)
}