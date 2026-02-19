package objectPractice
fun main(){
    val a=Vehicle.create("car")
    println(a.type)
}
class Vehicle(var type: String) {
companion object Factory{
    fun create(type: String): Vehicle{
        return when(type){
            "car"-> Vehicle("car")
            "bike"-> Vehicle("bike")
            else -> {
                Vehicle("Unknown")
            }
        }
    }
}
}