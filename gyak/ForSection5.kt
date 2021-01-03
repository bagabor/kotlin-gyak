open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int): KotlinBikeInterface {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println("Bike is in gear $gear with cadence of $cadence traveling at a speed of $speed")

    override fun printBrand() = println(brand)
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int) :
    KotlinBicycle(cadence, gear, speed) {

        override fun printDescription() {
            super.printDescription()
            println("The mountain bike has a seat height of $seatHeight")
        }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int, speed: Int): KotlinBicycle(cadence, gear, speed) {

}

interface KotlinBikeInterface {
    val brand: String
        get() = "someBrand"

    fun printBrand()
}



















