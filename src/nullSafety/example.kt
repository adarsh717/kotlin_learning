package nullSafety

var number:Int?=5
fun main(){
//    if number is null then its value is set to 0
    println((number?:0) * 2)
}