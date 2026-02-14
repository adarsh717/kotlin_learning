package inheritence
fun main(){
    var em= Employee("Adarsh")
    em.work()
    var de= Developer("Mayank")
    de.work()
}

open class Employee(open var name: String){
    open fun work(){
        println("$name is working")
    }
}

class Developer(override var name: String): Employee(name){
    override fun work(){
        println("$name is coding")
    }
}