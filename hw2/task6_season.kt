fun main() {
    var n = readLine()?.toIntOrNull() ?: 0;
    if (n == 12 || n < 3) {
        println("Winter");
    } else if (n < 6) {
        println("Spring");
    } else if (n < 9) {
        println("Summer");
    } else {
        println("Autumn");
    }
}
