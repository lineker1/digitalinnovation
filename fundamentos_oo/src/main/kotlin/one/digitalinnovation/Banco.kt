package one.digitalinnovation

data class Banco(
    val nome: String,
    val numero: Int,
) {
    fun info() = "Nome: $nome , Numero: $numero"
}
