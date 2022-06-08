package fundamentals




fun numbertoextension (number: Int): String {
    //return "cinco"
    if(number == 5){
        return "Five"
    }
    else if(number == 6){
        return "Six"
    }
    return "Unmapped number"
}

fun main(){
    println(numbertoextension(8))
}