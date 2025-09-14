fun main() {
    val words = (readLine() ?: "")
        .split(' ', ',', '?', '!', '.')
        .filter{ it.any{ ch -> ch.isLetter() } }
        .count();

    println(words);
}
