package nullSafety

var email: String?=null
fun main(){
    if (email==null){
        println("No email")
    }
    else if (email==""){
        println("Empty Email")
    }
    else{
        println(email?.uppercase())
    }
}