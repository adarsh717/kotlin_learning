fun main(){
    var gt=getter()
    gt.age=12

}
class getter {
    var age:Int=18
        set(value) {
            if (value<18){
                println("Age can not be lesser than 18 !")
            }
            else{
                field=value
            }
        }
}