package higherOrderFunction
fun calculate(a: Int,b: Int , calculation:(Int,Int)->Int){
    var result=calculation(a,b)
    println(result)
} // Defining Higher Order Function
fun add(a: Int,b: Int): Int{
    return a+b //Function which perform actual task
}
fun main(){
    calculate(5,5,::add) //here the reference of add function is passed..
}