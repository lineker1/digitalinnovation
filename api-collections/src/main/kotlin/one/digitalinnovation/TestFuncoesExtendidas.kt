package one.digitalinnovation

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("----------------")
    println(salarios.somatoria())

    println("----------------")
    println(println(salarios.media()))
}