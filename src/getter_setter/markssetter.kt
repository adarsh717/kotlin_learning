package getter_setter

fun main(){
    var m=markssetter()
    m.marks=80
    m.marks=150
}
class markssetter {
    var marks: Int=0
        set(value) {
            if (value in 0..100){ // check value under the range of 0 to 100
                field=value // field means actual memory variable jo property ki real value store karta hai
                println("$field")
            }
            else{
                println("Invalid marks")
            }
        }
}