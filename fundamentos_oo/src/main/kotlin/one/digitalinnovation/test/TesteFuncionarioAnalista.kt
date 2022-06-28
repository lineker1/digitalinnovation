package one.digitalinnovation.test

import one.digitalinnovation.Analista

fun main(){
    val joao = Analista("Joao", "111.111.111-33", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}
