fun main(){
    val array = arrayOf(1,5,2,3,4,8,9,6,5,4,7)
    for ((i,e) in array.withIndex()){
        println("$i $e") //print every value with index of the array

    }
    println(array[2]) // get the element of the array at.
    println(array.get(1)) // to get value of index at.
    println("value before set ${array[2]}")

    //set the value of index at.
    array.set(2,10)

    // Array after set the second index value explicitly.
    print("value after set : ${array[2]}")

}