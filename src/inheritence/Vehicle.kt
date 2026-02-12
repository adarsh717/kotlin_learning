package inheritence
fun main(){
    val c= Car()
    c.start()
    c.drive()
}
open class Vehicle { //parent class
    fun start(){
        println("Vehicle started !")
    }
}

class Car: Vehicle(){ // inherit vehicle class
    fun drive(){
        println("Car is driving !")
    }
}