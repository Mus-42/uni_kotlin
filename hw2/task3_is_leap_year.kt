fun main() {
    var year = readLine()?.toIntOrNull() ?: 0;
    val isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    println(if (isLeap) "YES" else "NO");
}
