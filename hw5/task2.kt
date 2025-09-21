data class Vehicle(
    var brand: String = "",
    var model: String = "",
    var releaseYear: Int = 0,
    var licencePlate: String = ""
);

fun newHondaCivic(releaseYear: Int, licencePlate: String) : Vehicle {
    return Vehicle(
        brand = "Honda",
        model = "Civic",
        releaseYear = releaseYear,
        licencePlate = licencePlate
    );
}

var nullableVehicle: Vehicle? = null;

fun main() {
    var vehicle = Vehicle()
        .apply{
            brand = "Honda";
            model = "Civic";
            releaseYear = 2020;
            licencePlate = "КА3344ВІ";
        }
        .also{
            println(it);
        };

    with(vehicle){
        println("Марка + ${brand}");
        println("Модель = ${model}");
        println("Рік випуску: ${releaseYear}");
        println("Номерний знак: ${licencePlate}");
    };

    nullableVehicle = newHondaCivic(2042, "AA42426BB");
    nullableVehicle?.let {
        with(it) {
            println("Марка + ${brand}");
            println("Модель = ${model}");
            println("Рік випуску: ${releaseYear}");
            println("Номерний знак: ${licencePlate}");
        }
    }
}
