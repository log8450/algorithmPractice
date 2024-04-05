import kotlin.math.abs

const val MODULO = 42

// https://dmoj.ca/problems/?search=COCI+%2706+Contest+1

fun main(args: Array<String>) {
    val numberList = readln().split(" ").map { it.toIntOrNull()?:throw Throwable("Invalid Input") }

    if(numberList.size != 3) throw Throwable("Invalid Input Size")

    if(numberList.any{ it > 100}) throw Throwable("Invalid Number")

    val str = readln()
    if (str.length != 3 ||
        str.indexOf('A') == -1 ||
        str.indexOf('B') == -1 ||
        str.indexOf('C') == -1
    ) throw Throwable("Invalid Order")

    val (n1,n2,n3) = numberList.sorted()

    val strArr = Array(3) { 0 }

    strArr[str.indexOf('A')] = n1
    strArr[str.indexOf('B')] = n2
    strArr[str.indexOf('C')] = n3

    println(strArr.joinToString(" "))
}