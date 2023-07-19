fun main() {
    val driver1 = Driver("Lewis Hamilton", "Mercedes", "United Kingdom", 44)
    val driver2 = Driver("Max Verstappen", "Red Bull Racing", "Netherlands", 33)
    val driver3 = Driver("Charles Leclerc", "Ferrari", "Monaco", 16)
    val driver4 = Driver("Lewis Hamilton", "Mercedes", "United Kingdom", 44)

    // Task 1: Printing Data
    println(driver1)
    println(driver2)
    println(driver3)

    // Task 2: Equality Check
    val areEqual = driver1 == driver2
    val areEqual2 = driver1 == driver4
    val areNotEqual = driver1 != driver2
    println("\nEquality Check: $areEqual")
    println("Inequality Check: $areNotEqual")
    println("Equality Check2: $areEqual2")

    // Task 3: Copying Data
    val copiedDriver = driver1.copy(number = 77)
    println("\nOriginal Driver: $driver1")
    println("Copied Driver: $copiedDriver")

    // Task 4: Destructuring Declarations
    var NombreExtraido = driver1.name
    var EquipoExtraido = driver1.team
    var PaisExtraido = driver1.country
    var NumeroExtraido = driver1.number
    println("\nNombre Extraido: $NombreExtraido")
    println("Equipo Extraido: $EquipoExtraido")
    println("Pais Extraido: $PaisExtraido")
    println("Numero Extraido: $NumeroExtraido")

    // Task 5: toString() Method
    var tostring = driver1.toString()
    println(tostring)
}