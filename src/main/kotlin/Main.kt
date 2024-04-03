const val MODULO = 42

// https://dmoj.ca/problems/?search=COCI+%2706+Contest+1

fun main(args: Array<String>) {
    val missionNumber = readln().toInt()

    var probabilityList = mutableListOf<List<Int>>()
    (0..<missionNumber).forEach {
        probabilityList += readln().split(" ").map { it.toInt() }
    }

    probabilityList.forEach { probability ->
        probability.forEach {
            print("${it} ")
        }
        println()
    }









}