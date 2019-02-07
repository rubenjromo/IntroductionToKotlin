package demo

fun main (args: Array<String>){

    println("Sum = ${getSum(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)}")

    val multiply = {num1: Int, num2: Int -> num1*num2}
    println("11 * 123 = ${multiply(11,123)}")

}

fun getSum (vararg nums: Int): Int {
    var sum = 0

    nums.forEach { n -> sum += n }
    return sum
}