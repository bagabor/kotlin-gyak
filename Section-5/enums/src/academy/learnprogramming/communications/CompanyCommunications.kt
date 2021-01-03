package academy.learnprogramming.communications

import java.time.Year


fun main(args: Array<String>) {
    println(Department.ACCOUNTING.getDeptInfo())

    println(CompanyCommunications.getTagline())
    println(CompanyCommunications.getCopyrightLine())
    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justUpperCase("this should be uppercase")
    val someClass2 = SomeClass.upperOrLowerCase("THIS SHOULD BE LOWERCASE", true)
    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45

    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }

    })

    println(thisIsMutable)

}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3), SALES("Sales", 20);

    fun getDeptInfo() = "The $fullName department has $numEmployees employees"
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeClass ${si.mustImplement(22)}")
}


object CompanyCommunications {

    val currentYear = Year.now().value;

    fun getTagline() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."

}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

class SomeClass private constructor(val someString: String) {

    private val s = 6


    companion object  {
        private val privateVar = 6

        fun justUpperCase(str: String) = SomeClass(str.toUpperCase())
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            }
            else {
                return SomeClass(str.toUpperCase())
            }
        }

        fun accessPrivateVar() = "I'm accessing privateVar $privateVar"
    }
}