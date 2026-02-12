fun main(){
   var a= Person3()
    a.age=-10 // internally called setter method.
    println(a.age) // internally called getter method

}
class Person3 {
    var age: Int=0 //field
        set(value) {
            if (value<0){ // check condition by passed value
                field=0
            }else{
                field=value
            }
        }
        get() {
            return field
        }
}