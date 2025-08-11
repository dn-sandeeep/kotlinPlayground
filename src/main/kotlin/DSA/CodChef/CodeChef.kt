fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val p = readLine()!!.split(" ").map { it.toInt() }

        var pos1 = -1
        var posN = -1

        for (i in 0 until n) {
            if (p[i] == 1) {
                pos1 = i
            }
            if (p[i] == n) {
                posN = i
            }
        }

        var ans = pos1 + (n - 1 - posN)
        if (pos1 > posN) {
            ans--
        }

        println(ans)
    }
}