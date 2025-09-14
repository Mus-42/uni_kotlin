fun isPrime(n: Int) : Boolean {
    if (n <= 1) 
        return false;
    if (n == 2) 
        return true;
    if (n % 2 == 0) 
        return false;
    
    var i = 3;
    while (i * i <= n) {
        if (n % i == 0)
            return false;
        i += 1;
    }

    return true;
}

fun main() {
    var n = readLine()?.toIntOrNull() ?: 0;
    if (isPrime(n)) {
        println("prime")
    } else {
        println("composite")
    }
}
