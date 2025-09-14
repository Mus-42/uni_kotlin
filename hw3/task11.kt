fun main() {
    val n = readLine()?.toInt() ?: 0;

    val ans = (1..n) 
        .map { readLine()?.toInt() ?: 0 }
        .reversed()
        .joinToString(" ");

    println(ans);
}
