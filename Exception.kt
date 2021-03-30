import java.lang.ArithmeticException
import java.lang.Exception

fun main() {

    try {
        val a = 10 / 0
    }
    catch (e:ArithmeticException)
    {
        println("exception")
    }
}