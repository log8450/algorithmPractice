fun main(args: Array<String>) {
    val setting = readln()
    val rows = setting.split(" ").firstOrNull()?.toIntOrNull()?:throw Throwable("Invalid input")
    val cols = setting.split(" ").lastOrNull()?.toIntOrNull()?:throw Throwable("Invalid input")

    val originSquare = Array(rows) { CharArray(cols) {' '} }
    (0..<rows).forEach { r ->
        originSquare[r] = readln().toCharArray()
    }

    val pairList = mutableListOf<Pair<Int, Int>>()

    originSquare.forEachIndexed { r, row ->
        row.forEachIndexed { c, data->
            if(data == '.') {
                pairList.add(r to c)
            }
        }
    }


    //
    //XOXX--
    //XOOX--
    //OOXO--
    //OOXX--
    //------
    //------
//    originSquare.forEach {
//        println(it)
//    }
//
//    pairList.forEach {
//        println("${it.first},${it.second}")
//    }

    fun judgement(garo: Int, sero:Int, cursor: Pair<Int,Int>):Boolean {
//        println("판정 : ${garo} ${sero} ${cursor.first},${cursor.second}")

        (1..sero).forEach { x ->
            (1..garo).forEach { y ->
//                println("Pair(cursor.first + x - 1, cursor.second + y -1) : ${Pair(cursor.first + x - 1, cursor.second + y -1)}")
                if (!pairList.contains(Pair(cursor.first + x - 1, cursor.second + y -1))) return false
            }
        }
        return true
    }

    var max = 0

    /** 직사각형 크기 */
    (1..rows).forEach { row ->
        (1..cols).forEach { col ->

            /** 좌표(왼쪽위꼭지점) */
            (0..<rows).forEach { r ->
                (0..<cols).forEach { c ->

                    /** 테이블을 놓을 수 있는지 */
                    if(judgement(row, col, Pair(r, c))) {
                        max = maxOf(max, (row+col)*2)
                    }
                }
            }


//            var r = 0
//            while (r < rows) {
//                var c = 0
//                while (c < cols) {
//                    if(originSquare[r][c] == '.') {
//                        if (judgement(row, col, Pair(r, c))) {
//                            max = maxOf(max, (row + col) * 2)
//                        }
//                    }
//                    c++
//                }
//                r++
//            }



        }
    }










//    println("max : ${max-1}")

    println(max-1)

//    println(judgement(1,1, 0 to 1))
//    println(judgement(1,1, 0 to 0))
//    println(judgement(1,1, 1 to 1))
//
//    println("===")
//    println(judgement(1,3, 0 to 1))
//    println("===")
//    println(judgement(2,2, 0 to 0))

    // 문제를 iteration으로 분해하기

    /*   // 직사각형 가로
       var x = 1
       while(x <= cols) {
           // 직사각형 세로
           var y = 1
           while(y <= rows) {






               originSquare.forEachIndexed { r, row ->
                   row.forEachIndexed { c, data ->
                       (0..<x)
                   }
               }
           }
           x++
       }
   */


//    var x = 1
//    var y = 1

    // (0,0) 이 가능한가?
    // (1,0) 이 가능한가?
    // (2,0) 이 가능한가?

    // (0,1) 이 가능한가?
    // (1,1) 이 가능한가?
    // (2,1) 이 가능한가?

    // (0,2) 이 가능한가?
    // (1,2) 이 가능한가?
    // (2,2) 이 가능한가?

//    var x = 1
//    var y = 2

    // (0,0), (0,1) 이 가능한가?
    // (1,0), (1,1) 이 가능한가?
    // (2,0), (2,1) 이 가능한가?

    // (0,1), (0,2) 이 가능한가?
    // (1,1), (1,2) 이 가능한가?
    // (2,1), (2,2) 이 가능한가?

//    var x = 2
//    var y = 1

    // (0,0), (1,0) 이 가능한가?
    // (0,1), (1,1) 이 가능한가?
    // (0,2), (1,2) 이 가능한가?


//    var x = 2
//    var y = 2

    // (0,0), (1,0), (0,1), (1,1) 이 가능한가?













}