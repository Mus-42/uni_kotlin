import kotlin.random.Random

fun main() {
    var array = (1..100).map{ _ -> Random.nextInt(-100, 100) };
    var result: List<Int> = array
        .filter{ x -> x > 0 }
        .filter{ x -> x % 5 == 0 }
        .map{ x -> x * x }
        .sorted();

    println("min: ${result[0]} max: ${result[result.count() - 1]}");

    println(
        result
            .map{ x: Int -> x.toString() }
            .joinToString(" ")
    );
}
