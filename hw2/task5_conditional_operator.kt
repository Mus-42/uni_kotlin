fun main() {
    var x = readLine()?.toLongOrNull() ?: 0;
    var xx = x * x;
    var xxx = x * x * x;
    if (x >= 13) {
        println(3 * xxx + 4 * xx + 5 * x + 6);
    } else {
        println(3 * xxx - 2 * xx - 3 * x - 4);
    }
}
