import kotlin.random.Random

fun createRandomArray(numElements: Int, maxValue: Int) : List<Int>? {
    if (numElements <= 0 || maxValue <= 0)
        return null;
    return (1..numElements).map{ Random.nextInt(maxValue) };
}

fun main() {
    createRandomArray(10, 100500)
        ?.also { println(it) }
        ?.let { it.map { num: Int -> if (num % 2 == 0) num * 2 else num } }
        ?.also { println(it) }
        ?.let { it.max() }
        ?.also { println("Максимальне значення масиву ${it}") } 
}
