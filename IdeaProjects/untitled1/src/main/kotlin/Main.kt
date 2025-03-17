import kotlin.concurrent.thread

fun main(args: Array<String>) {

    val cal = Calculator()

    println("Quer participar de um jogo? S/N")
    var resposta = readLine()

    //caso 1
    if(resposta == "S" || resposta == "s"){
        //caso 3
        for (i in 1..10){
            println(i)
            Thread.sleep(1000)
        }

        //caso 4
        val array = arrayOf("Lukas", "Matheus","Kevin","Cesar")
        for (i in 0..3 ){
            println(array[i])
            Thread.sleep(500)
        }

        //caso 5
        val array2 = arrayOf(1, 2, 3, 4, 5, 6)
        println(array2[5])

        //caso 6
        var cont = 0
        while (cont < 5){
            println(cont)
            cont++
        }

    }else if (resposta == "N" || resposta == "n"){
        val x = 1
        //caso 2
        when(x){
            1-> println("X==1")
        }
    }
}

// casos 7,8,9 e 10
class Calculator(){
    fun soma(num1: Float, num2: Float) : Float{
        return num1 + num2
    }
    fun sub(num1: Float, num2: Float) : Float{
        return num1 - num2
    }
    fun mult(num1: Float, num2: Float) : Float{
        return num1 * num2
    }
    fun div(num1: Float, num2: Float) : Float{
        return num1 / num2
    }
}