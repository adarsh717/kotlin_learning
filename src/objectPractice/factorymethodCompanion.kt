package objectPractice
fun main(){
    var a=Person.Factory.create("student")
    print(a.type)
}
class Person(val type: String){
    object Factory{
        fun create(type: String): Person{
            return when(type){
                "student"-> Person("student")
                "teacher"-> Person("teacher")
                else -> {
                    Person("person")
                }
            }
        }
    }
}