package academy.learnprogramming.oochallenge

fun main() {

//    val bicycle = Bicycle(10, 3, 10)
//    bicycle.printDesc()
//
//    val mountainBike = MountainBike(20, 10, 10, 30)
//    mountainBike.printDesc()
//
//    val roadBike = RoadBike(10, 10, 10, 3)
//    roadBike.printDesc()
//
//    val bicycle2 = Bicycle(10, 10)
//    bicycle2.printDesc()
//
//    val mountainBike2 = MountainBike(20, 10, 10)
//    mountainBike2.printDesc()
//
//    val roadBike2 = RoadBike(10, 10, 10)
//    roadBike2.printDesc()

    val mountainBike3 = MountainBike("Blue",10, 10, 10)
//    mountainBike3.printDesc()
    println(mountainBike3.color)

//    MountainBike.availableColors.forEach { println(it) }

}


open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10): MyInterface {

    fun applyBrake(decrement: Int) {
        speed -= decrement;
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    override fun printDesc() {
        println("Cadence: $cadence gear: $gear speed: $speed")
    }
}


class MountainBike(private var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) : Bicycle(cadence, gear, speed) {

    var color: String? = null;

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):
            this(seatHeight, cadence, speed, gear){
        this.color = color
//        println(color)
    }

    companion object {
        val availableColors = listOf("Blue", "Green", "Red", "Yellow")
    }

    override fun printDesc() {
        super.printDesc()
        println("seatHeight: $seatHeight")
    }
}

class RoadBike(private val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10) : Bicycle(cadence, speed, gear) {

    override fun printDesc() {
        super.printDesc()
        println("tireWidth: $tireWidth")
    }
}

interface MyInterface {
    fun printDesc()
}



