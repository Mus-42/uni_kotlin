fun main() {
    readLine();
    val positive = (readLine() ?: "")
        .split(" ")
        .map{ it.toDouble() }
        .filter{it > 0};

    if (positive.count() == 0) {
        println("Not Found");
    } else {
        val mean = positive.sum() / positive.count().toDouble();
        println(String.format("%.2f", mean));
    }
}
