fun main() {
    readLine();
    val numbers = (readLine() ?: "")
        .split(" ")
        .map{ it.toInt() }
        .sortedWith(Comparator<Int>{ a: Int, b: Int -> if (a == b) 0 else if (a % 2 == b % 2) a % 2 - a.compareTo(b) else a.compareTo(b) });

    println(numbers.joinToString(" "));
}
