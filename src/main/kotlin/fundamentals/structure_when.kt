package fundamentals



fun main(){

    val x = 5

    when(x){

        5 -> println("x == 5")
        8 -> println("x == 8")
        10 -> {
            println("x == 10")
            println("x it's a dozen")
        }
        in 11..15 -> println("x == 11..15?")
        !in 16..20 -> println("x não está no range 16..20")
        else -> println("Unmapped number")

    }
}

fun comecacomoi(x: Any): Boolean{

    val x = "Oi Rebeca"
    return when(x){

        is String -> x.startsWith("Oi")
        else -> false

    }

}
