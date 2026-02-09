fun main(){
    val result=Rectangle(5,8)
    println("Area: ${result.area()}")
    println("Perimeter: ${result.perimeter()}")

}
class Rectangle(val length: Int,val width: Int) {
    fun area(): Int{
        return length*width
    }
    fun perimeter(): Int{
        return 2*(length+width)
    }
}