package nullSafety

var name1: String?=null

// it only executes when string is not null..

fun main(){
    name1?.let {
        println(it.length)
    }
}