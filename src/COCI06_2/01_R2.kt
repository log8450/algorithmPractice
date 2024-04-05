//https://dmoj.ca/problem/coci06c2p1

/**
 * 값 1개와 평균이 주어질 때 두번째 값을 구하는 문제
 * (r1 + r2) / 2 = mean 이므로
 * r2 = mean * 2 - r1
 */
fun main(args: Array<String>) {
    val numberList = readln().split(" ").map { it.toIntOrNull()?:throw Throwable("Invalid Input") }

    if(numberList.size != 2) throw Throwable("Invalid Input Size")

    if(numberList.any{ it > 1000 || it < -1000}) throw Throwable("Invalid Number")

    val r1 = numberList[0]
    val mean = numberList[1]

    val r2 = mean * 2 - r1

    println(r2)
}