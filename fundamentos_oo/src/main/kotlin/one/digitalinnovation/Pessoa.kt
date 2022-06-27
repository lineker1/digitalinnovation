package one.digitalinnovation

class Pessoa {
    var nome: String = "Lineker"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome \nCpf: $cpf"
    }

fun main(){
    val lineker = Pessoa()
    println(lineker.pessoaInfo())
}