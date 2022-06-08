package fundamentals

class car(var color: String, var yearfabrication: Int, var owner: owner){
    override fun toString(): String {
        return "Classe: Car, " +
                "\n Color: ${color}, " +
                "\n Year Fabrication: ${yearfabrication}."
    }
}

data class owner(var name: String, var lastname: String){

}

fun main() {
    var car = car("White", 1989, owner("Richard", "Santos"))
    println(car.color)
    print(car.owner.name)
}