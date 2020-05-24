fun main() {
    /*
     * 条件语句
     */

    var x = 2

    println("if-else-if")
    if (x > 0) {
        println("x>0")
    } else if (x == 0) {
        println("x=0")
    } else {
        println("x<0")
    }

    println("when")
    when (x) {
        in 0..10 -> println("x=0")
        in 10..20 -> println("x=1")
        else -> println("x=" + x)
    }
}