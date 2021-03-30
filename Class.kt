//primary constructors
class Employee(empid:Int, empname: String)
{
    val id: Int = empid
    var name: String = empname
    init {
        println("id is $id")
        println("name is $name")
    }
    }
fun main()
{
    println(Employee(12,"jwhcg"))
}
