package proposition

import proposition.delegates.ParamDefault
import proposition.delegates.ParamEnum
import proposition.delegates.ParamRequired

class RawSafe {

    //@Serializes?
    var name: String? by ParamRequired()

    var lastName: String? by ParamRequired()

    var age: Int? by ParamDefault(defaultValue = 44)

    var gender: String? by ParamEnum(listOfValues = listOf("M", "F"))

}

// + Simple Code
// + Less Code
// + Doesn't get repeated everywhere
// + Almost no test =D

// - Can't be used with Data Classes
// - Separation is not so clear as compared to actual implementation
// - For complex cases, we need a mapping