fun main(){
    val a=10
    val b=20
    val add=addition(a,b)
    print(add)
    println("subtraction : ${sub(a,b)}")
    greet()
    namegreet("Adarsh yadav")
}
//fun addition(a1: datatype, a2 datatype): function return type
fun addition(a1: Int,a2:Int): Int{
    return a1+a2
}
fun sub(a1: Int,a2:Int): Int{
    return a1-a2
}
//no param no return
fun greet(){
    print("Hello Duniya")
}
//function with parameter
fun namegreet(name: String){
    print("Hello : $name")
}
// short form of expression function
fun mul(a1:Int,a2: Int):Int=a1*a2