fun main(){
    val initexample=initExample("Adarsh",22)
    initexample.studentdetail()
}
class initExample(val name: String,val age: Int) {
    init {
        println("$name is $age years old.")
    }
    fun studentdetail(){
        print("Name: $name Age: $age")
    }
}