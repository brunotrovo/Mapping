package proposition.delegates

import proposition.RawSafe
import kotlin.reflect.KProperty

class ParamEnum(private val listOfValues: List<String>) {

    private lateinit var localValue: String

    operator fun getValue(rawSafe: RawSafe, property: KProperty<*>): String? {
        return localValue
    }

    operator fun setValue(rawSafe: RawSafe, property: KProperty<*>, value: String?) {

        if (value.isNullOrEmpty())
            throw Exception("${property.name} is required, wrong or whatever ")

        if (!listOfValues.contains(value))
            throw Exception("${property.name} has in invalid value, wrong or whatever ")

        localValue = value!!
    }

}