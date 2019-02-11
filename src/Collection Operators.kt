package demo

fun main(args: Array<String>){

    val numList2 = 1..20

    val listSum = numList2.reduce{x, y -> x+y}
    println("Reduce sum: $listSum")
    //Reduce sum: 210

    val listSum2 = numList2.fold(5){x, y -> x+y}
    println("Fold sum: $listSum2")
    //Fold sum: 215

    println("Evens: ${numList2.any{it%2==0}}") //true
    println("Evens: ${numList2.all{it%2==0}}") //false

    val big3 = numList2.filter{it > 3}
    big3.forEach{n -> println(">3 :$n")}

    
}