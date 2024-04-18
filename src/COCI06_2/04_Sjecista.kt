//https://dmoj.ca/problem/coci06c2p4

fun main(args: Array<String>) {
    val number = readln().toIntOrNull()?:throw Throwable("Invalid")
    if(number < 3 || number > 100) throw Throwable("Invalid Int")

    /** nC4  n(n-1)(n-2)(n-3) / 1*2*3*4 */
    println(number*(number-1)*(number-2)*(number-3)/24)
}