import kotlin.math.sqrt
import kotlin.random.Random

class SquareEquation(
    a: Double,
    b: Double,
    c: Double
) {
    var a: Double = a;
    var b: Double = b;
    var c: Double = c;

    init {
        if (a == 0.0) {
            throw IllegalArgumentException();
        }
    }

    constructor(a: Int, b: Int, c: Int) : this(a.toDouble(), b.toDouble(), c.toDouble());

    constructor(b: Double, c: Double) : this(1.0, b.toDouble(), c.toDouble());

    override fun toString() = "${a} * x^2 + ${b} * x + ${c}";

    val discriminant: Double 
        get() = b * b - 4.0 * a * c;

    fun solitions() : List<Double> {
        val d = this.discriminant;

        if (d < 0.0) 
            return listOf();
        if (d == 0.0) 
            return listOf(-b / a * 0.5);
        
        val dSqrt = sqrt(d);

        return listOf((-b + dSqrt) / a * 0.5, (-b - dSqrt) / a * 0.5);
    }
}

const val MAX_COEFFICIENT: Double = 42.0;

fun randomSquareEquation() : SquareEquation {
    while (true) {
        var a = Random.nextDouble() * MAX_COEFFICIENT;
        if (a == 0.0) continue;
        var b = Random.nextDouble() * MAX_COEFFICIENT;
        var c = Random.nextDouble() * MAX_COEFFICIENT;

        return SquareEquation(a, b, c);
    }
}

fun main() {
    for (i in 1..100) {
        val eq = randomSquareEquation();
        if (eq.solitions().count() == 2) {
            println(eq);
        }
    }
}
