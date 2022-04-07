package fundamentals

fun main(){

    //printoneaten()
    //printoneatenpar()
    //printoneaten2(50, 7)
    //whiletest()
    //dowhiletest()

}

fun printoneaten(){

    for(number in 1 .. 10){
        println(number)
    }

}

fun printoneaten2(number1: Int, number2: Int){

    for(number in number1 downTo  number2){
        println(number)
    }

}

fun printoneatenpar(){

    for(number in 1 .. 10 step 2){
        println(number)
    }

}

fun whiletest(){
    var x = 1
    while(x < 10) {
        println("Esse numero é o ${x}")
        x++ //ou x = x+1
    }
}

fun dowhiletest(){
    var x = 0
    do {
        println(x)
    }
        while(x < 10)

}