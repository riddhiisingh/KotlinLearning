fun main(){
    print("Enter name, age and residence\n")
    val name:String = readLine()!!.toString()
    val age:Int = readLine()!!.toInt()
    val residence:String = readLine()!!.toString()

    println("===User Info===")
    println("name:$name")
    println("age: $age")
    println("residence: $residence")
}