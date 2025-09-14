fun main() {
    var a = readLine()?.toIntOrNull() ?: 0;
    var b = readLine()?.toIntOrNull() ?: 0;
    var ab = 0;
    for (i in 1..b) {
        ab += a;
    }
    println(ab);
}
