package one.digitalinnovation

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 5000.0

    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.0, 1230.0, 5400.0)

    salarios2.sort()
    salarios2.forEach { println(it) }

}

