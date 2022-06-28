package one.digitalinnovation.test

import one.digitalinnovation.Cliente
import one.digitalinnovation.ClienteTipo


fun main() {
    val jose = Cliente(
        "Jose da Silva",
        "333.555.666-33",
        ClienteTipo.PF, "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)


}




