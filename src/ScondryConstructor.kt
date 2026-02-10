fun main(){
    val person1=Person("Adarsh",21)
    person1.show()
}
class Person(var name: String) {
    var age: Int = 0

    constructor(personname: String, age: Int) : this(personname) {
        this.age = age
    }
        fun show(){
            println("Name: $name")
            println("Age: $age")
        }
    }

