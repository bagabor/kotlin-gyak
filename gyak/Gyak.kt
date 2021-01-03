fun main() {
//    println(simpleArraySum(arrayOf(1, 2, 3, 4, 10, 11)))
//    println(compareTriplets(arrayOf(17,28,30), arrayOf(99,16,8)))
//    println(plusMinus(arrayOf(-4, 3, -9, 0, 4, 1)))
//    plusMinus(arrayOf(1, -2, -7, 9, 1, -8, -5))
//    println(getMoneySpent(arrayOf(3,1), arrayOf(5,2,8),10))
}



fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var result = -1
    for (i in keyboards){
        for (j in drives){
            if( (i + j <= b) && (result < i + j)) {
                result = i + j
            }
        }
    }
    return result
}

fun plusMinus(arr: Array<Int>): Unit {
    if (arr.isNullOrEmpty()) {
        throw java.lang.IllegalArgumentException("Params cannot be null.")
    }
    val mapForNumbers = mutableMapOf<String, Int>()

    arr.forEach { i ->
        when {
            i > 0 -> {
                mapHandler(mapForNumbers, "Positive")
            }
            i < 0 -> {
                mapHandler(mapForNumbers, "Negative")
            }
            else -> {
                mapHandler(mapForNumbers, "Zero")
            }
        }
    }

    if(mapForNumbers.containsKey("Positive")) {
        println( "%.5f".format(mapForNumbers.getValue("Positive").toDouble() / arr.size) )
    }else {
        println("0.000000")
    }
    if(mapForNumbers.containsKey("Negative")) {
        println( "%.5f".format(mapForNumbers.getValue("Negative").toDouble() / arr.size) )
    } else {
        println("0.000000")
    }
    if(mapForNumbers.containsKey("Zero")) {
        println( "%.5f".format(mapForNumbers.getValue("Zero").toDouble() / arr.size) )
    } else {
        println("0.000000")
    }

//    val allThePositiveNumbersCount = arr.filter { i -> i > 0 }.count()
//    val allTheNegativeNumbersCount = arr.filter { i -> i > 0 }.count()
//    val allTheZeroNumbersCount = arr.filter { i -> i > 0 }.count()


}

fun mapHandler(mapForNumbers: MutableMap<String, Int>, type: String) {
    if (!mapForNumbers.containsKey(type)) {
        mapForNumbers[type] = 1
    } else {
        var alreadyStoredValue: Int = mapForNumbers.getValue(type)
        mapForNumbers[type] = alreadyStoredValue.plus(1)
    }
}


fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    if (a.isNullOrEmpty() || b.isNullOrEmpty()) {
        throw java.lang.IllegalArgumentException("Params cannot be null.")
    }
    var resultA = 0
    var resultB = 0
    for (i in 0..2) {
        if (a[i] < b[i]) {
            ++resultB
        } else if (a[i] > b[i]) {
            ++resultA
        }
    }
    return arrayOf(resultA, resultB)
}

fun simpleArraySum(ar: Array<Int>): Int {
    if (ar == null || ar.isEmpty()) {
        throw IllegalArgumentException("Param cannot be null or empty.")
    }
    var sumOfElements = 0
    ar.forEach { i -> sumOfElements += i }
    return sumOfElements
}