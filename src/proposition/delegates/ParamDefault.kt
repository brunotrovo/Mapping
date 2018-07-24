package proposition.delegates

import proposition.RawSafe
import kotlin.reflect.KProperty

class ParamDefault(private val defaultValue: Int) {

    private var localValue: Int? = null

    operator fun setValue(thisRef: RawSafe, property: KProperty<*>, value: Int?) {
        if (value == null)
            this.localValue = defaultValue
        else
            this.localValue = value
    }

    operator fun getValue(thisRef: RawSafe, property: KProperty<*>): Int? {
        return this.localValue
    }

}