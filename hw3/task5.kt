import kotlin.random.Random

fun stringFilter(arr: List<String>, f: (String) -> Boolean): List<String> {
    return arr.filter(f);
}

fun main() {
    val arr = listOf("alkas1", "shhs", "42", "", "a");
    val filtred = stringFilter(arr){ x -> x.any{ ch -> ch.isDigit() } };
    println(filtred);
}
