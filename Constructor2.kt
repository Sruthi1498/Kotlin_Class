open class Men
{
    constructor(id:Int,name: String,salary:Double)
    {
        var id: Int = id
        var name: String = name
        var salary: Double = salary
        println("id is $id , name is $name, salary is $salary")
    }
}
class Abc : Men {
    constructor(id: Int, name: String) : super(id, name, 78089.6) {
        var id: Int = id
        var name: String = name
        println("ïd is $id, name is $name")
    }
}

fun main()
{
    Abc(12,"alice")
}