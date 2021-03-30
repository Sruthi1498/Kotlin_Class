import java.lang.Integer.parseInt
import java.lang.NumberFormatException

fun main()
{
    val i = "h"
    val a :Int?  = try { parseInt(i) }
    catch (e: NumberFormatException) { null }
}