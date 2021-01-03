package academy.learnprogramming.lambdas

import sun.text.normalizer.UTF16.append


fun main(args: Array<String>) {

    //println(countTo100())


    val employees = listOf(Employee("John", "Smith", 2012),
                           Employee("Jane", "Wilson", 2015),
                           Employee("Mary", "Johnson", 2010),
                           Employee("Mike", "Jones", 2002))

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    "Some String".apply somestring@ {
        "Another String".apply {
            println(toLowerCase())
            println(this@somestring.toUpperCase())
        }
    }


}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return@returnBlock
        }
    }

    println("Nope, there's no employee with the last name $lastName")
}

fun countTo100() =
    StringBuilder().apply() {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

//fun countTo100() =
//        with(StringBuilder()) {
//            for (i in 1..99) {
//                append(i)
//                append(", ")
//            }
//            append(100)
//            toString()
//        }


//fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}
