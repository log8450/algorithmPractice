//https://dmoj.ca/problem/coci06c2p3

fun main(args: Array<String>) {
    val setting = readln()
    val ant1 = setting.split(" ").firstOrNull()?.toIntOrNull()?:throw Throwable("Invalid input")
    val ant2 = setting.split(" ").lastOrNull()?.toIntOrNull()?:throw Throwable("Invalid input")

    val line1 = readln()
    val line2 = readln()

    val line = line1.reversed() + line2
    val time = readln().toIntOrNull()?:throw Throwable("Invalid Time")

    if(line1.length != ant1) throw Throwable("Invalid setting")
    if(line2.length != ant2) throw Throwable("Invalid setting")
    if(line1.up)

    val cArr = CharArray(line.length) {'_'}
    line1.toCharArray().forEachIndexed { idx, c ->
        // 이동중인 개미의 위치
        var cursor = line1.length - 1 + time - 2 * idx
        // 아직 이동하지 않는 개미의 위치
        if (line1.length - idx - 1 > cursor) cursor = line1.length - idx - 1
        // 이동이 끝난 개미의 위치
        else if (line1.length - idx - 1 + line2.length < cursor) cursor = line1.length - idx - 1 + line2.length

        cArr[cursor] = c
    }

    line2.toCharArray().forEachIndexed { idx, c ->
        // 이동중인 개미의 위치
        var cursor = line1.length - time + 2 * idx
        // 이동이 끝난 개미의 위치
        if(idx > cursor) cursor = idx
        // 아직 이동하지 않는 개미의 위치
        else if (line1.length + idx < cursor) cursor = line1.length + idx

        cArr[cursor] = c
    }
    println(cArr)
}