class ClassExample {
    var name="Adarsh"
    var age =22
    fun study(){
        println("Studying......")
    }
}

fun main(){
    var s1=ClassExample() // object created of ClassExample.
    println(s1.name)
    println(s1.age)
    s1.study() //function calling through class object.
}