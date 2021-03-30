class Man {
    constructor(id: Int, name: String)
    {
        var id:Int = id
        var name:String = name

        println("id is $id")
        println("name is $name")
    }

    constructor(id:Int, name: String,salary:Double)
    {
        var id:Int = id
        var name:String = name
        var salary:Double = salary

        println("id is $id")
        println("name is $name") 
        println("salary is $salary")
    }
}

fun main()
{
    Man(1,"adkj")
    Man(87,"whgec",979.076)
    Man(3,"av")
}
