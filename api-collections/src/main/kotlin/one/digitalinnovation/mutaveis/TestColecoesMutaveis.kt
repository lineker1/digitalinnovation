package one.digitalinnovation.mutaveis

import one.digitalinnovation.Funcionario

//Uma lista mutavel é uma lista que pode ser alterada!

fun main() {
    val joao = Funcionario("João", 5000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 3000.0, "PJ")

    println("-------LIST-------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("-----------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-----------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-------SET-------")
    val funcionariosSet = mutableSetOf(joao)
    //funcionariosSet.forEach { println(it) }

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

}
