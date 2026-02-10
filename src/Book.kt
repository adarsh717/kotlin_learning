fun main(){
var book=Book("Kotlin basics",300)
}
class Book(title: String) {
    var pages=0
    init {
        println("Book title initialized")
    }
    init {
        println("Pages default value set")
    }
    constructor(booktittle: String,pages: Int)
            :this(booktittle){
                this.pages=pages
        println("Full book details initialized")
    }
}