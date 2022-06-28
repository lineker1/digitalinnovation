package one.digitalinnovation.test

import one.digitalinnovation.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} , ${elemento.descricao}")
    }

    //usando somente o IT
    ClienteTipo.values().forEach {
        println("${it.name} , ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} , ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} , ${pj.descricao}")
}
