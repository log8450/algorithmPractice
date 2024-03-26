const val MODULO = 42

// https://dmoj.ca/problems/?search=COCI+%2706+Contest+1

fun main(args: Array<String>) {
    val patternP1 = "..#."
    val patternP2 = ".#.#"
    val patternW1 = "..*."
    val patternW2 = ".*.*"

    val number = readln()

    val strArray = Array(5) { "" }

    number.forEachIndexed { idx, c ->
        if(idx % 3 == 2) {
            // Wendy Pattern
            strArray[0] += patternW1
            strArray[1] += patternW2
            strArray[2] += "*.${c}."
            strArray[3] += patternW2
            strArray[4] += patternW1
        } else {
            // Peter Pattern
            strArray[0] += patternP1
            strArray[1] += patternP2
            strArray[2] += if(idx == 0) "#.${c}."
                        else if(idx % 3 == 0) "*.${c}."
                        else "#.${c}."
            strArray[3] += patternP2
            strArray[4] += patternP1
        }
    }

    strArray[0] += "."
    strArray[1] += "."
    strArray[2] += ""
    strArray[3] += ""
    strArray[4] += ""

    strArray.forEach {
        println(it)
    }
}