package demo
import java.util.Arrays //in order to print Arrays

fun main(args: Array<String>){

    var myArray = arrayOf(1,1.23, "Ruben")

    println(Arrays.toString(myArray)) //referencing Arrays (imported package)
    println(myArray[2])

    myArray[1] = 3.14

    println(Arrays.toString(myArray))

    println("Length of Array: ${myArray.size}")

    println("Ruben in array: ${myArray.contains("Ruben")}" )

    var partArray = myArray.copyOfRange(0,2)

    println("First: ${myArray.first()}")
    println("Ruben index: ${myArray.indexOf("Ruben")}")

    println(Arrays.toString(partArray))
    println("First element of partArray ${partArray.first()}")
    println("Last element of partArray ${partArray.last()}")


    var sqArray = Array(5, {x-> x*x})
    println(sqArray[3])

    var array2: Array<Int> = arrayOf(1,2,3)
    print(Arrays.toString(array2))
}