class Calculadora {

    fun sum(n1: Int, n2: Int): Int{

        return n1 + n2
    }
    fun sub(n1: Int, n2: Int): Int{

        return n1 - n2
    }
    fun mult(n1: Int, n2: Int): Int{

        return n1 * n2
    }
    fun divi(n1: Int, n2: Int): Int{

        return n1 / n2
    }

    fun verifica(): Int{
        println("Qual operação deseja fazer:\n" +
                "1- Soma\n" +
                "2- Subtração\n" +
                "3- Multiplicação\n" +
                "4- Divisão")
        var op = readLine()!!.toInt()
        while(op <1 || op >4){
            println("Opção inválida!!!")
            println("Qual operação deseja fazer:\n" +
                    "1- Soma\n" +
                    "2- Subtração\n" +
                    "3- Multiplicação\n" +
                    "4- Divisão")
            op = readLine()!!.toInt()
        }
        return op
    }
}