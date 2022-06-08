package fundamentals

fun main(){
    val name = returname()
    println(" * ~ ${name}")
    dizoi(name, 20)

}

fun returname(): String {

    return "Richard Santos"
}

fun dizoi(name: String, year: Int){

    println("Eu sou ${name}, eu tenho ${year} de idade.")

}