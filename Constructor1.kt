class Sum
{
    constructor(a:Int,b:Int): this(a,b,10)
    {
        println("The sum is ${a+b}")
    }
    constructor(a:Int, b:Int, c: Int)
    {
        println("The sum is ${a+b+c}")
    }
}
fun main()
{
    Sum(3,6)
}