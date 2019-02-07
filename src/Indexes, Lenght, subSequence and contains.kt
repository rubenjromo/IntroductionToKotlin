package demo

fun main(args: Array<String>){

    val myName = "Ruben Romo"
    val longString = """This  is a long string and thats why this goes with triple
        |
        |
        |
    """.trimMargin()

    var firstName: String = "Ruben"
    var lastName: String = "Romo"

    var fullname = firstName + " " + lastName

    println("Name: ${fullname}")

    println("1+5 = ${1+5}")

    println("String Length: ${longString.length}")

    var str1 = "A random string"
    var str2 = "B random string"
    println("Strings Equal: ${str1.equals(str2)}")
    println("Strings Equal: ${str1==str2}")

    println("Compare A to B: ${"A".compareTo("B")}")

    println("Second Index: ${str1.get(2)}")
    println("Another way to get second Index: ${str1[2]}")

    println("Index 2 to 6: ${str1.subSequence(2,7)}")

    println("Contains random: ${str1.contains("random")}")
}