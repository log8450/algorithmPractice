const val MODULO = 42

fun main() {
    val numberSet = mutableSetOf<Int>()
    (1..10).forEach { _ ->
        val number = readln().toIntOrNull() ?: throw Throwable("Invalid Number")
        if(number < 0 || number > 1000) throw Throwable("Invalid Range")
        numberSet += number % MODULO
    }
    println(numberSet.size)
}