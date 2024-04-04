//https://dmoj.ca/problem/coci06c1p4
//https://dmoj.ca/problems/?search=COCI+%2706+Contest+2

fun main(args: Array<String>) {
    var map = readln()
    val row = map.split(" ").first().toIntOrNull()?: throw Throwable("Invalid Int")
    val col = map.split(" ").last().toIntOrNull()?: throw Throwable("Invalid Int")

    if(row>50 || col>50) throw Throwable("Invalid Size")

    var forestString = ""

    (0..<row).forEach { r ->
        forestString += readln()
    }


    val forest = forestString.toCharArray()
    var sList = listOf(forestString.indexOf("S"))

    var fList = listOf<Int>()
    forest.forEachIndexed { index, char ->
        if (char == '*') {
            fList += index
        }
    }
    var count = 0

    var flag = true
    while(sList.isNotEmpty()) {
        val sTempList = sList.toList()
        count++
        // 중간에 빠져나오는 루프는 any all 사용
        sTempList.forEach { s ->
            sList -= s
            forest[s] = 'A'

            // D 확인
            // 위로 확장
            if(s >= col && forest[s-col] == 'D') {
                flag = false
            }
            // 왼쪽으로 확장
            if(s % col != 0 && forest[s-1] == 'D') {
                flag = false
            }
            // 오른쪽으로 확장
            if(s % col != col-1 && forest[s+1] == 'D') {
                flag = false
            }
            // 아래로 확장
            if(s+col < forest.size && forest[s+col] == 'D') {
                flag = false
            }

            // 위로 확장
            if(s >= col && forest[s-col] == '.') {
                forest[s-col] = 'S'
                sList += s-col
            }
            // 왼쪽으로 확장
            if(s % col != 0 && forest[s-1] == '.') {
                forest[s-1] = 'S'
                sList += s-1
            }
            // 오른쪽으로 확장
            if(s % col != col-1 && forest[s+1] == '.') {
                forest[s+1] = 'S'
                sList += s+1
            }
            // 아래로 확장
            if(s+col < forest.size && forest[s+col] == '.') {
                forest[s+col] = 'S'
                sList += s+col
            }
        }

        if(!flag) break

        val fTempList = fList.toList()
        fTempList.forEach { f ->
            fList -= f
            forest[f] = 'F'
            // 위로 확장
            if(f >= col && (forest[f-col] == '.' || forest[f-col] == 'S')) {
                forest[f-col] = '*'
                fList += f-col
                sList -= f-col
            }
            // 왼쪽으로 확장
            if(f % col != 0 && (forest[f-1] == '.' || forest[f-1] == 'S')) {
                forest[f-1] = '*'
                fList += f-1
                sList -= f-1
            }
            // 오른쪽으로 확장
            if(f % col != col-1 && (forest[f+1] == '.' || forest[f+1] == 'S')) {
                forest[f+1] = '*'
                fList += f+1
                sList -= f+1
            }
            // 아래로 확장
            if(f+col < forest.size && (forest[f+col] == '.' || forest[f+col] == 'S')) {
                forest[f+col] = '*'
                fList += f+col
                sList -= f+col
            }
        }


//        forest.forEachIndexed { idx,c ->
//            if(idx%col==0)print("\n")
//            print(c)
//        }
    }

    if(flag) {
        println("KAKTUS")
    } else {
        println("${count}")
    }
}