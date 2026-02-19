package objectPractice

object Counter{
    var count=0
    fun increment(){
        count++
    }
}

fun main(){
    Counter.increment()
    Counter.increment()
    print(Counter.count)

}