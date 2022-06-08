package fundamentals

fun main(){

    println(evenorodd(2))
    println(evenorodd(3))
    println(evenorodd(4))
    recuperation(10,10,10)


}

fun evenorodd(number: Int): String {
    return if(number % 2 == 0) {
        "Par"
    }
    else
        "Impar"

}

fun recuperation(value: Int, value2: Int, value3: Int){

    val media = (value + value2 + value3) / 3
    println("Valor da média é ${media}")

    if (media < 6) {
        println("Recuperação")
    }
    else if (media == 10) {

        println("Nota Perfeita, parabéns =)!")

    }
    else if (media > 6 ) {
        println("Na média")
    }


}