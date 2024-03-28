fun main(args: Array<String>) {
    val patternP1 = "..#.".toCharArray()
    val patternP2 = ".#.#".toCharArray()
    val str = readln()

    if(str.length > 15) throw Throwable("Invalid Length")

    val strArray = Array(5) { charArrayOf() }

    str.forEach { c ->
        strArray[0] += patternP1
        strArray[1] += patternP2
        strArray[2] += "#.${c}.".toCharArray()
        strArray[3] += patternP2
        strArray[4] += patternP1
    }
    strArray[0] += charArrayOf('.')
    strArray[1] += charArrayOf('.')
    strArray[2] += charArrayOf('#')
    strArray[3] += charArrayOf('.')
    strArray[4] += charArrayOf('.')

    (1..str.length/3).forEach { idx ->
        strArray[0][idx*12-2] = '*'
        strArray[1][idx*12-3] = '*'
        strArray[1][idx*12-1] = '*'
        strArray[2][idx*12-4] = '*'
        strArray[2][idx*12] = '*'
        strArray[3][idx*12-3] = '*'
        strArray[3][idx*12-1] = '*'
        strArray[4][idx*12-2] = '*'
    }

    strArray.forEach {
        println(it)
    }
}