fun main() {
    readLine();

    val ans = (readLine() ?: "")
        .split(' ')
        .map { it.toInt() }
        .map { if (it >= 0) it+2 else it }
        .joinToString(" ");

    println(ans);
}
