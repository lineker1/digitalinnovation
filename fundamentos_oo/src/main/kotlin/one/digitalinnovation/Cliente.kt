package one.digitalinnovation

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
                Nome:    $nome
                Cpf:     $cpf
                Salario: ${clienteTipo.descricao}
    """.trimIndent()
}