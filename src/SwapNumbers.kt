fun main(){
    print("enter number 1")
    var number1 = readLine()!!.toInt()
    print("enter number 2")
    var number2 =readLine()!!.toInt()

    var temp = number1
    number1 = number2
    number2=temp

    println("Swapped Numbers ==== Number1: $number1, Number2:$number2")


}