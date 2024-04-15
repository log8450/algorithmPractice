//https://dmoj.ca/problem/coci06c2p4

fun main(args: Array<String>) {
    val number = readln().toIntOrNull()?:throw Throwable("Invalid")
    if(number < 3 || number > 100) throw Throwable("Invalid Int")

    println(number*(number-1)*(number-2)*(number-3)/24)
}