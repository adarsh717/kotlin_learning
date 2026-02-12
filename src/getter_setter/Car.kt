package getter_setter

fun main(){
    var car=Car2()
    car.speed=-250
    println(car.speed)
    car.speed=100
    println(car.speed)
    car.speed=200
    println(car.speed)
}
class Car2 {
    var speed:Int=0
        set(value) {
            if (value<0){
                field=0
            }
            else if (value>200){
                field=200
            }
            else{
                field=value
            }

        }
        get() {
            println("Getter Called")
            return field
        }
}