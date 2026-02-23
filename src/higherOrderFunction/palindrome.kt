package higherOrderFunction


fun main(){
    var ls=listOf("Madam","Civic","gun","school")
    println(ls.filter { isPalindrome(it) })
}
fun isPalindrome(str: String): Boolean{
    return str.lowercase()==str.lowercase().reversed()
}