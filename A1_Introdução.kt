// Aula 1: Primeiro contato

fun main() {
    println("1. Olá, mundo!")

    print("2. Gustavo Augustin
    print(" ")
    print("Augustin")

    println()

    var nome = "3. Gustavo Augustin\nAugustin\nAugustin"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Gustavo" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "Augustin"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " Augustin" + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}