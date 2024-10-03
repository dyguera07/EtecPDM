//Aula 5: Funções

fun main(){
    println("println() é uma função utilitária e main também é uma função")

    bomDia();
    bomDia();
    bomDia();

    bomDia2();

    //chama o método e passo o parâmetro
    hello("Gustavo Augustin");

    var resultado = soma(7 , 9);
    println(resultado)

    //o segundo é opcional, caso não defina ele usará o default nesse caso 3
    println(subtracao(10.0 , 9));

    println(divisao(9, 2.0));

    //Dependendo dos parâmetros passados o programa sabe escolher qual usar
    mensagem("Gustavo" , "Augustin");
    mensagem("Gustavo" , 18);
    mensagem("Augustin");
    mensagem(18, "Gustavo");
}

fun bomDia(){
    println("Bom dia!");
}

fun bomDia2() = print("Bom dia 2!")


// tem parâmetro tipo string pra receber  nome
fun hello(nome: String){
    println("Olá, $nome")
}

fun hello2(nome: String) = println("Olá, $nome")

fun soma(a: Int, b: Int):Int {
    var resultado = a + b
    return resultado
}

fun soma2(a: Int, b: Int) = a + b;

fun subtracao(a: Double, b: Int = 3) = a - b ;

fun divisao(a: Int, b: Double) = (a / b);

fun mensagem(nome: String, sobrenome: String){
    println("Bem-vindo $nome $sobrenome")
}

fun mensagem(nome: String, idade: Int){
    println("como vai, $nome. Você tem $idade anos? ")
}

fun mensagem(sobrenome: String) = println("Seu sobrenome é $sobrenome");

fun mensagem(idade:Int, nome:String) = println("Você tem $idade, $nome?")