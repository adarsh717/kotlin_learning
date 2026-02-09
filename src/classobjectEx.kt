fun main(){
//val person=Person()
//    person.introduce()
    val car=Car("M4 competition",2021)
    car.CarInfo()
}
//class Person{
//    var name: String="Anuj"
//    var age: Int=22
//    fun introduce(){
//        print("Hi my name is $name and i'm $age years old.")
//    }
//}
class Car(val brand: String,val year: Int){
    fun CarInfo(){
        print("Car:$brand,Year:$year")
    }
}