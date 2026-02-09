fun main(){
    val result=Result("Adarsh",95)
    result.isPassed()
}
class Result(val name: String,val marks: Int){
    fun isPassed(){
        if (marks>=40){
            print("$name is Passed.")
        }
        else
            print("Fail")
    }
}