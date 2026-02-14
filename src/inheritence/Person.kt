package inheritence
fun main(){
    val s= Student("Adarsh",101)
    s.showName()

    println(s.rollNumber)
}
open class Person(var name: String) {
    fun showName(){
        println(name)
    }
}

class Student(name: String,var rollNumber: Int) : Person(name)

