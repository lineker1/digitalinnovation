package one.digitalinnovation.test

import one.digitalinnovation.Analista
import one.digitalinnovation.Funcionario
import one.digitalinnovation.Gerente

fun main(){
    val maria = Gerente("Maria do Carmo", "222.222.222-44", 4000.0)
    ImprimeRelatorioFuncionario.imprime(maria)

}
