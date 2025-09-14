import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    
    println(if (firstResult == secondResult) "you win" else "you lose");
}
