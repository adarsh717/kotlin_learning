package collection

var student = mutableListOf<String>()
fun main(){
    student.add("Adarsh")
    student.add("Mayank")
    student.add("Abhishek")
    student.add("Sahil")
    println(student.get(1))
    student[2] = "Rahul"
//    for (i in student){
//        if (i=="Rahul"){
//            println("Yes Rahul is present")
//        }
//    }
    if (student.contains("Rahul")){
        println("Yes Rahul is present!")
    }
    student.forEach {
        println(it)
    }
}