package demo

fun main(args: Array<String>){

    if (true is Boolean){
        println("True is Boolean")
    }

    var letter: Char = 'A'
    println("A is a char: ${letter is  Char}")
}