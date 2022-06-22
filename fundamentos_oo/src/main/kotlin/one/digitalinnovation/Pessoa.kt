package one.digitalinnovation

class Pessoa {
    var nome: String = "Lineker"
    var cpf: String = "123.123.123-11"

    inner class Endereco {
        var rua: String = "Rua Germano Westarb"
    }
}
fun main(){
    val lineker = Pessoa()

    println(lineker.nome)
    println(lineker.cpf)
}