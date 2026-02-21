package collection


fun main(){
    var num=mutableListOf<Int>()
    var totalsum=0
    num.add(1)
    num.add(2)
    num.add(3)
    num.add(4)
    num.add(5)
    for (i in num){
        if (i%2==0){
            println(i)
            totalsum+=i
        }

    }
    print(totalsum)
}