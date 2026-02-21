package collection

var number = mutableListOf(1,2,2,3,3,3,4,4,4,4)
fun main(){
    number.add(2)
    number.forEach {
        println(it)
    }
    number.remove(2)
    println(number.size)
}
//to get length of collection(List,Set,Map) we use size method...