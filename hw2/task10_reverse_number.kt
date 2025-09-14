fun main() {
    var n = readLine()?.toIntOrNull() ?: 0;
    
    if (n == 0) {
        println(0);
        return;
    }

    while (n != 0) {
        print(n % 10);
        n /= 10;
    }
    println();
}
