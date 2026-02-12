package getter_setter

fun main(){
    var m= Mobile()

    m.volume=-5
    println(m.volume)
    m.volume=15
    println(m.volume)
    m.volume=7
    println(m.volume)
}

class Mobile {
    var volume: Int=0
        set(value) {
            if (value<0){
                field=0
            }
            else if(value>10){
                field=10
            }
            else{
                field=value
            }
        }
        get() {
            println("Getter called! ")
            return field
        }
}