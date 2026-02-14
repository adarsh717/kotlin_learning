package polymorphism

fun main(){
    var cal= Calculator()
    println(cal.add(2,4))
    println(cal.add(2.4,5.6))
}

class Calculator{
    fun add(a:Int, b:Int):Int{
        return a+b;
    }
    fun add(a: Double,b: Double): Double{
        return a+b
    }
}