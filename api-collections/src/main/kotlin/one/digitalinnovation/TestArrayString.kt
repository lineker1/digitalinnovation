package one.digitalinnovation

fun main() {
    val nomes = Array<String>(3){""}

    nomes [0] = "Maria"
    nomes [1] = "Arlindo"
    nomes [2] = "SemArlindo"

    for (nome in nomes){
        println(nome)
    }

    val nomes2 = arrayListOf<String>("Lineker", "Jose", "Maria" )

    nomes2.forEach{
        (println(it))
    }
}