package one.digitalinnovation.mutaveis

import one.digitalinnovation.Funcionario
import one.digitalinnovation.Repositorio

fun main() {
    val joao = Funcionario("João", 5000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 3000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.FindById(joao.nome))

    println("-----------------")
    repositorio.findAll().forEach { println(it) }

    println("-----------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}