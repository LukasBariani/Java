/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {

ex10()
}
//ex 1 e 2----------------------------------------
fun ex1e2(nome:String){
    // printa o nome
    println(nome)
}
// ex 3-------------------------------------------
fun ex3(n1:Float, n2:Float){
    var soma = n1 + n2
    var sub = n1 - n2
    var div = n1 / n2
    var mult = n1 * n2
    println("A soma entre os numeros é " + soma)
    println("A subtraçao entre os numeros é " + sub)
    println("A divisao entre os numeoros é " + div)
    println("A multiplicaçao entre os numeoros é " + mult)
}
//ex 4--------------------------------------------
fun ex4(base:Float, alt:Float){
    val area = base * alt
    println("A area do retangulo é " + area)
}
//ex 5--------------------------------------------
fun ex5(): String{
    val a = "STRING"
    return a
}
//ex 6-------------------------------------------
fun ex6(){
    val array = arrayOf("hollow nite", "gud ofi uar", "DE lest ofi uz")
    for(item in array){
        println(item)
    }
}
//ex 7-------------------------------------------
fun ex7(array: Array<String>, elemento: String): Array<String>{
    return array + elemento
}
//ex 8------------------------------------------
fun ex8(){
    val senha = "123"
    var tentativas = 0

    while (tentativas < 3){
        println("Digite a senha")

        val senhaDigit = readLine()

        if (senha == senhaDigit){
            println("Senha Correta")
            return
        }
        else{
            println("Senha incorreta! Tentativas restantes: ${2 - tentativas}")
        }
        tentativas++
    }
}
//ex 9------------------------------------------
fun ex9(){
    println("Digite um valor: ")
    val valor1 = readLine()?.toIntOrNull()

    println("Digite outro valor: ")
    val valor2 = readLine()?.toIntOrNull()

    if (valor1 != null && null != valor2){
        if (valor1 > valor2){
            println("$valor1 é maior que $valor2")
        }else if(valor1 < valor2){
            println("$valor2 é maior que $valor1")
        }else{
            println("$valor1 é igual a $valor2")
        }
    }
}

fun ex10(){
    var contador = 0
    while (contador <= 10){
        println(contador)
        contador++
    }
}