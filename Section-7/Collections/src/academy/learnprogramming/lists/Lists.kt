package academy.learnprogramming.lists


fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "summer", "winter")
    val colorList = listOf("black", "white", "red", "black", "red")

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)

    println(strings.last())

    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())

    println(colorList.zip(strings))

    val mergedLists = listOf(colorList, strings)
    println(mergedLists)

    val combinedList = colorList + strings
    println(combinedList)

    val noDupsList = colorList.union(strings)
    println(noDupsList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

    //if (strings.size > 5) {
    //    println(strings[5])
    //}
}