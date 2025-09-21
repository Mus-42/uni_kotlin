data class Employee(
    var name: String,
    var surname: String,
    var position: String
);

fun main() {
    val oleg = Employee(
        name = "Oleg",
        surname = "Hendriks",
        position = "barber's assistant"
    );

    var oleg2 = oleg;

    var mykola = Employee(
        name = "Mykola",
        surname = "Panenko",
        position = "elder barber"
    );

    var mykola2 = mykola.copy();
    
    println(oleg);
    println(mykola);

    println(oleg.hashCode());
    println(oleg2.hashCode());
    println(mykola.hashCode());
    println(mykola2.hashCode());

    println(oleg == oleg2);
    println(mykola == mykola2);

    println(oleg === oleg2);
    println(mykola === mykola2);

    var (name, surname, position) = mykola;
    println(name);
    println(surname);
    println(position);
}
