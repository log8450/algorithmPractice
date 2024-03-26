fun main() {
    val number = readln().toIntOrNull() ?: throw Throwable("Invalid Number")
    if(number < 0 || number > 10000) throw Throwable("Invalid Range")

    println("%.6f".format(number*number*Math.PI))
    println("%.6f".format((number*number*2).toDouble()))
}