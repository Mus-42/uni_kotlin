import kotlin.random.Random

fun countSatisfying(arr: List<String>, f: (String) -> Boolean): Int {
    return arr.map { s -> if (f(s)) 1 else 0 }.sum();
}

fun main() {
    val arr = listOf("alkas1", "shhs", "42", "", "a");
    val count = countSatisfying(arr){ x -> x.any{ ch -> ch.isDigit() } };
    println(count);
}
