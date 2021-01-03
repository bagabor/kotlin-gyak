fun main(args: Array<String>) {

    //first section
//    val hello1 = "Hello"
//    val hello2 = "Hello"
//
//    println("Are strings referencial equal? ${hello1 === hello2}")
//
//    var number = 2988
//
//    val someString: Any = "Some string"
//    if(someString is String) {
//        println(someString.toUpperCase())
//    }


//    second section
    val firstFloat = -3847.384f
    val secondFloat: Float? = -3847.384f
    val thirdFloat: Float? = (-3847.38).toFloat()

    val firstArrayOfShortNumbers = shortArrayOf(1,2,3,4,5)
    val secondArrayOfShortNumbers: Array<Short> = arrayOf(1,2,3,4,5)
    val arrayOfShortNumbers = Array(5) {i -> i + 1}

//    for (i in arrayOfShortNumbers){
//        println(i)
//    }
    val arrayOfIntNumbers = Array<Int?>(40) {i -> i + 5}

    val charArray = charArrayOf('a','b','c')
//    ForSection2().method1(charArray)

    val x: String? = "I AM IN UPPERCASE"
    val y = x?.toLowerCase() ?: "I give up!"
//    println(y)

    x?.let { it.toLowerCase().replace("am", "am not") }

    val myNotNullVariable: Int? = null
    myNotNullVariable!!.toDouble()
}
