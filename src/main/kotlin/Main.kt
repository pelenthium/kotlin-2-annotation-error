import java.lang.reflect.ParameterizedType

class A {
    fun <T> getType(f: (T) -> Unit) {
        println((f.javaClass.genericInterfaces[0] as ParameterizedType).actualTypeArguments[0])
    }
}

fun main () {
    A().getType<String> { a -> }
}