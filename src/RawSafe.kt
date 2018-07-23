import delegates.ParamDefault
import delegates.ParamEnum
import delegates.ParamRequired

class RawSafe {

    var name: String? by ParamRequired()

    var lastName: String? by ParamRequired()

    var age: Int? by ParamDefault(defaultValue = 44)

    var gender: String? by ParamEnum(listOfValues = listOf("M", "F"))

}

/**********************************************************************************************************************
 **********************************************************************************************************************
 **********************************************************************************************************************/

fun main(args: Array<String>) {

    val rawSafe = RawSafe()
    rawSafe.age = null
    rawSafe.gender = "M"
    rawSafe.name = "Name"
    rawSafe.lastName = "LastName"

}