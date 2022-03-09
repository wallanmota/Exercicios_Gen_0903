fun main() {

    val calculadora = Calculadora()

    println("Bem vinde!!! Vamos calcular?\nSerão solicitados dois numeros e a operação" +
            "que deseja fazer.")
    print("Digite o primeiro número: ")
    val n1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    var n2 = readLine()!!.toInt()

    val op = calculadora.verifica()
    var res = 0

    if(n2 == 0 && op == 4){
        println("Não é possivel dividir por 0 será considerado o número 1")
        n2 = 1
    }

    when(op){
        1 -> res = calculadora.sum(n1, n2)
        2 -> res = calculadora.sub(n1, n2)
        3 -> res = calculadora.mult(n1, n2)
        4 -> res = calculadora.divi(n1,n2)
    }
    println("O resultado da operação é $res")
}
