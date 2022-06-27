package one.digitalinnovation

class Pessoa {
    var nome: String = "Lineker"
    var cpf: String = "123.123.123-11"
    private set

    }

fun main(){
    val lineker = Pessoa()

    println(lineker.nome)
    println(lineker.cpf)
}