fun main() {
    var pizzaSlices = 0
    // Start refactoring here
    pizzaSlices += 1;
    while (pizzaSlices <= 6) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices += 1;
    }
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}
