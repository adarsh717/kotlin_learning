fun main(){
   var a= Person3()
    a.age=-10
    println(a.age)

}
class Person3 {
    var age: Int=0
        set(value) {
            if (value<0){
                field=0
            }else{
                field=value
            }
        }
        get() {
            return field
        }
}