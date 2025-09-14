fun repeatN(n: Int, action: () -> Unit) {
    (1..n).forEach{ _ -> action() };
}

fun main() {
    repeatN(5){ println("Hello") };
}
