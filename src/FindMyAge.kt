import java.util.*

fun main(){

    print("Enter year of birth")
    val YearOfBirth = readLine()!!.toInt()
    val yearinDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age = yearinDevice - YearOfBirth

    print("You are $age years old")
}