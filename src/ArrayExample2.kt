fun main(){
    val list = listOf("Adarsh","Mayank","Anuj","unknown")
    print(list.joinToString(" | ")) // print with custom separator
    print(list.joinToString(
        " , ",
        prefix = "[",
        postfix = "]"
    )) // printing element of list with separator,prefix & postfix.
    print(list.joinToString(limit = 2))
}