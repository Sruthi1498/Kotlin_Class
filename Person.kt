class Person(var id: Int, var name: String)
{

        var i = "id id $id".also(::println)

    init {
        println("inside the init block")
    }
    var j = "name is $name".also(::println)
    init {
        println("inside 2nd init block")
    }
}
fun main()
{
    Person(1,"skd")
}