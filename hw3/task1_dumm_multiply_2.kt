fun main() {
    var a = readLine()?.toIntOrNull() ?: 0;
    var b = readLine()?.toIntOrNull() ?: 0;
    
    println((1..a).fold(0){ v, _ -> v + b });
}
