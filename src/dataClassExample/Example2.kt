package dataClassExample

fun main(){
    val student1= Student("Rahul",85)
    println(student1)
    val student2=student1.copy(marks=90)
    println(student1==student2)
    val (name , marks)=student2
    println("Name: $name")
    println("Marks: $marks")

}
data class Student(var name: String,var marks: Int)