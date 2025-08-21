package DSA.CodChef

import kotlin.math.ceil

fun main() {
    val(n, x, y) = readLine()!!.split(" ").map { it.toInt() }

    val recquiredWeight = y/x
    val requiredWhecle =  ceil(n/recquiredWeight.toDouble())
    print(requiredWhecle.toInt())


}
