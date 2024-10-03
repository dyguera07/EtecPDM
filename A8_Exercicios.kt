/*
    Aula 8: Exercício de reforço
    Métodos e funções
 */

/* 1. Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos. Saída desejada:
    2 anos equivalem a:
        24 meses
        730 dias
        17520 horas
        1051200 minutos
        63072000 segundos
 */

// 2. Escreva uma função capaz de receber um string e retornar a quantidade de caracteres

// 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)

// 4. Escreva uma função capaz de receber uma medida em milhas e converter em km (1 milha = 1.6 km)

/* 5. Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por "x". Observando que:
    a. Não deve existir lógica dentro da função main. Main só deve ser usada como ponto de entrada.
    b. Escrever uma função para a troca de letras e impressão do valor final.
    c. String final deve estar com todas as letras maiúsculas
    Exemplo: Entrada = "Programação em Kotlin" - Saída = "PROGRxMxÇxO EM KOTLIN"
 */

fun main() {

    println(converterAnos(5)) // Chamada da função 1 com variável alterada

    println(contarCaracteres("Exemplo")) // Chamada da função 2 com variável alterada

    println(calcularCubo(7)) // Chamada da função 3 com variável alterada

    println(converterMilhasParaKm(10.0)) // Chamada da função 4 com variável alterada

    trocarLetrasEImprimir("Kotlin é Fantástico") // Chamada da função 5 com variável alterada
}

// 1. Função para converter anos em meses, dias, horas, minutos e segundos
fun converterAnos(periodo: Int): String { // Alterado nome da variável de 'anos' para 'periodo'
    val totalMeses = periodo * 12 // Alterado nome de 'meses' para 'totalMeses'
    val totalDias = periodo * 365 // Alterado nome de 'dias' para 'totalDias'
    val totalHoras = totalDias * 24 // Alterado nome de 'horas' para 'totalHoras'
    val totalMinutos = totalHoras * 60 // Alterado nome de 'minutos' para 'totalMinutos'
    val totalSegundos = totalMinutos * 60 // Alterado nome de 'segundos' para 'totalSegundos'

    return """
        $periodo anos equivalem a:
        $totalMeses meses
        $totalDias dias
        $totalHoras horas
        $totalMinutos minutos
        $totalSegundos segundos
        """.trimIndent()
}

// 2. Função para contar a quantidade de caracteres em uma string
fun contarCaracteres(palavra: String): Int = palavra.length // Alterado nome de 'str' para 'palavra'

// 3. Função para calcular o cubo de um número inteiro
fun calcularCubo(valor: Int): Int = valor * valor * valor // Alterado nome de 'n' para 'valor'

// 4. Função para converter milhas em quilômetros
fun converterMilhasParaKm(distancia: Double): Double = distancia * 1.6 // Alterado nome de 'milhas' para 'distancia'

// 5. Função para trocar letras "a" ou "A" por "x" e imprimir o resultado em maiúsculas
fun trocarLetrasEImprimir(texto: String) { // Alterado nome de 'str' para 'texto'
    val resultadoFinal = texto.replace(Regex("[aA]"), "x").toUpperCase() // Alterado nome de 'resultado' para 'resultadoFinal'
    println(resultadoFinal)
}