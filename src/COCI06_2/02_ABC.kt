//https://dmoj.ca/problem/coci06c2p2

/**
 * 입력받은 세개의 정수를 순서에 맞게 배열하는 문제
 * A는 첫번째, B는 두번째, C는 세번째 정수이다
 * 입력받은 정수를 정렬하고, 각각을 A,B,C의 순서에 할당한다
 */
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