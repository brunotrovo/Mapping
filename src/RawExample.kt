data class RawObject(val name: String?,
                     val age: Int?,
                     val gender: String?) // M or F

// ---

data class SafeObject(val name: String,
                      val age: Int,
                      val gender: Gender) {

    enum class Gender {
        MALE, FEMALE
    }

}

// ---

class Map() {

    fun doIt(rawObject: RawObject): SafeObject {

        if (rawObject.name.isNullOrEmpty()) throw Exception("This is a required field ${rawObject.name} - $rawObject")
        if (rawObject.age == null) throw Exception("This is a required field ${rawObject.age} - $rawObject")
        if (rawObject.gender == null) throw Exception("This is a required field ${rawObject.age} - $rawObject")

        val gender = when (rawObject.gender) {

            "M" -> SafeObject.Gender.MALE
            "F" -> SafeObject.Gender.FEMALE
            else -> throw Exception("This is a required field ${rawObject.gender} - $rawObject")
        }

        return SafeObject(rawObject.name!!,
                rawObject.age,
                gender
        )

    }

}