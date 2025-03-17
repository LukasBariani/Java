fun main(args: Array<String>) {
    
    val cal = Calculator()

    println("Quer participar de um jogo? S/N")
    var resposta = readLine()
    
    if(resposta == "S" || resposta == "s"){

        for (i in 1..10){
            println(i)
            Thread.sleep(1000)
        }

    }else if (resposta == "N" || resposta == "n"){
        val x = 1
        when(x){
            1-> println("X==1")
        }
    }
}

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
