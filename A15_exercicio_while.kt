fun verificarXO(texto: String): Boolean {
    var xCount = 0
    var oCount = 0
    var i = 0

    if (!texto.contains('x', true) && !texto.contains('o', true)) {
        return false
    }

    do {
        if (texto[i].lowercaseChar() == 'x') {
            xCount++
        } else if (texto[i].lowercaseChar() == 'o') {
            oCount++
        }
        i++
    } while (i < texto.length)

    return xCount == oCount
}

fun main() {
    println("Digite o texto para verificar 'x' e 'o':")
    val texto = readLine() ?: ""

    val resultado = verificarXO(texto)
    println("O número de 'x' e 'o' é igual? $resultado")
}