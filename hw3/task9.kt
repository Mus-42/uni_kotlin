fun main() {
    readLine();
    val numbers = (readLine() ?: "")
        .split(" ")
        .map{ it.toInt() }
        .sortedWith(Comparator<Int>{ 
            a: Int, b: Int -> 
                if (a == b) 0 else if ((a % 2 == 0).xor(b % 2 == 0)) Math.abs(b % 2) - Math.abs(a % 2) else (b - a) * (1 - Math.abs(a % 2) * 2)
        });


    println(numbers.joinToString(" "));
}
