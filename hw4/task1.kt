import kotlin.math.sqrt
import kotlin.random.Random

class Triangle(
    x: Float,
    y: Float = x,
    z: Float = y
) {
    var x: Float = x
        set(value) {
            if (!isCorrectTriangle(value, y, z)) {
                throw IllegalArgumentException();
            }
            field = value;
        };

    var y: Float = y
        set(value) {
            if (!isCorrectTriangle(x, value, z)) {
                throw IllegalArgumentException();
            }
            field = value;
        };

    var z: Float = z
        set(value) {
            if (!isCorrectTriangle(x, y, value)) {
                throw IllegalArgumentException();
            }
            field = value;
        };

    constructor(x: Int, y: Int, z: Int) : this(x.toFloat(), y.toFloat(), z.toFloat());

    init {
        if (!isCorrectTriangle(x, y, z)) {
            throw IllegalArgumentException();
        }
    }

    override fun toString() = "Triangle(${x}, ${y}, ${z})";

    val perimether: Float
        get() = x + y + z;

    val area: Float
        get() {
            val p = (x + y + z) * 0.5f;
            return sqrt(p * (p - x) * (p - y) * (p - z));
        }

    companion object {
        fun isCorrectTriangle(x: Float, y: Float, z: Float) : Boolean {
            if (x < 0 || y < 0 || z < 0) {
                return false;
            }
            if (x + y < z || y + z < y || z + z < x) {
                return false;
            }
            return true;
        }
    }
};

const val MAX_SIDE_LEN: Float = 42f;

fun randomTriangle() : Triangle {
    while (true) {
        var a = Random.nextFloat() * MAX_SIDE_LEN;
        var b = Random.nextFloat() * MAX_SIDE_LEN;
        var c = Random.nextFloat() * MAX_SIDE_LEN;

        if (!Triangle.isCorrectTriangle(a, b, c))
            continue;

        return Triangle(a, b, c);
    }
}

fun main() {
    var maxAreaOne: Triangle? = null;
    var maxAreaSeen = -1f;

    for (i in 1..100) {
        val tri = randomTriangle();
        if (tri.area > maxAreaSeen) {
            maxAreaSeen = tri.area;
            maxAreaOne = tri;
        }
    }
    
    maxAreaOne?.let {
        println(it);
        println("Area ${it.area}");
    };
}
