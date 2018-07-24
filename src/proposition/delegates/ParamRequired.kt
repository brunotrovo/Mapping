package proposition.delegates

import proposition.RawSafe
import kotlin.reflect.KProperty

class ParamRequired {

    private var localValue: String? = null

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String?) {
        if (value.isNullOrEmpty()) throw Exception("${property.name} is required, wrong or whatever ")
        this.localValue = value
    }

    operator fun getValue(rawSafe: RawSafe, property: KProperty<*>): String? {
        return this.localValue
    }

}