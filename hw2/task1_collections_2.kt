fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "HTTP"
    val isSupported = requested.toUpperCase() in SUPPORTED;
    println("Support for $requested: $isSupported")
}
