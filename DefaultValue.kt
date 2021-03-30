class PPerson(id:Int = 101, name: String = "asd")
{
    val pid:Int = id
    var pname: String = name

    init {
        println("id is $id")
        println("namd is $name")
    }
}
fun main()
{
    PPerson(1,"rwg")
    PPerson(34,"ahecg")
    PPerson(7)
    PPerson()
}