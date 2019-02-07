package demo

fun main(args: Array<String>){

    fun add(num1:Int, num2:Int): Int = num1 + num2

    println("234 + 567 = ${add(234,567)}")

    fun subtract(num1:Int = 1, num2:Int = 1) = num1 - num2

    println("234 - 567 = ${subtract(234,567)}")
    println("Default values = ${subtract()}")

    fun sayHello(name: String) : Unit = println("Hello $name")

    sayHello("Ruben")

    val (five, six) = nextTwo(4)
    println("4 $five $six")

}

fun nextTwo(num: Int): Pair <Int, Int>{
    return Pair(num+1, num+2)
}