fun main() {
    val input = readLine() ?: "";
    val occurrances = mutableMapOf<Char, Int>();
    for (ch in input) {
        occurrances[ch] = (occurrances[ch] ?: 0) + 1;
    }
    println(occurrances);
}
