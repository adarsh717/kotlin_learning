package nullSafety

var newName: String?=null
fun main(){
    val length=newName?.length?:0
    println(length)
}