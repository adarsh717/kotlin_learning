package inheritence
fun main(){
    var dog= Dog()
    println(dog.name
    )
    dog.makeSound()
}
open class Animal {
    open var name: String="animal"
    open fun makeSound(){
        println("Animal make sound")
    }
}

class Dog: Animal() {
    override var name:String="Dog"
    override fun makeSound() {
        println("Dog is barking")
    }
}