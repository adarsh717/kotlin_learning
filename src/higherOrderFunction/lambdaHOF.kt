package higherOrderFunction

import java.awt.Desktop

fun operateNumber(a: Int, action: (Int)-> Int){
   println(action(a))
}
fun main() {
    operateNumber(5){it*it}
    operateNumber(5){it*it*it}
}