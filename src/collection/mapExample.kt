package collection

fun main(){
    var students=mutableMapOf<Int, String>()
    students[1]="Adarsh"
    students[2]="Vikas"
    students[3]="Shashank"
    println(students)
    students[3]="Rahul"
    println("Map after change the 3 student name! ")
    students.forEach {
        println(it)
    }
}
