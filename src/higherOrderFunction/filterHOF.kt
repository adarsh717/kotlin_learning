package higherOrderFunction
var number=listOf(1,2,3,4,5,6,7,8,9,10)

fun main(){
    var newNum=number.filter { it%2==0 }
    println(newNum)
}