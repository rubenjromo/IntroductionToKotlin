package demo

fun main (args: Array<String>) {

    val numList = 1..20
    val evenList = numList.filter{it % 2 == 0}
    evenList.forEach {n -> println(n)}

    val mult3 = makeMathFunction(3)
    println("5 * 3: ${mult3(5)}")

    val multiply2 = {num1: Int -> num1*2}
    val numList2 = arrayOf(1,2,3,4,5)

    mathonList(numList2, multiply2)
}

fun makeMathFunction (num1: Int): (Int) -> Int = {num2 -> num1*num2}

fun mathonList(numList: Array<Int>, myFunc:(num:Int)-> Int) {
    for (num in numList) {
        println("MathonList: ${myFunc(num)}")
    }
}