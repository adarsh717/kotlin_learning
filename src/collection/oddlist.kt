package collection

fun main(){
    var num=mutableListOf<Int>()
    num.add(1)
    num.add(2)
    num.add(3)
    num.add(4)
    num.add(5)
    num.add(6)

    var odd=mutableListOf<Int>()
    for (i in num){
        if (i%2!=0){
            odd.add(i)
        }
    }
    println(odd)
}