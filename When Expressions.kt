fun main(){
    val value = 3
    val stringOfValue = when (value){
        1 ->{
            println("One")
            "Value is 1"
        }
        2 ->{
            println("two")
            "Value is 2"
        }
        3 ->{
            println("Three")
            "Value is 3"
        }
        4 ->{
            println("Four")
            "Value is 4"
        }
        5 ->{
            println("Five")
            "Value is 5"
        }
        else ->{
            println("Underfined")
            "Value cannot be reached"
        }
    }
    println(stringOfValue)

}