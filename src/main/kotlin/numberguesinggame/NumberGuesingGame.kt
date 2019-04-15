package numberguesinggame

import java.util.*
fun main(){
    game(5)
}
fun game(num: Int): Int {
    val randomNumber =(1..10).shuffled().last()
    print("Enter a number from 1 to 10: ")
    val input = Scanner(System.`in`)
    val num = input.nextInt()
    return if (num == randomNumber){
        println("Correct! the number is: $randomNumber")
        println("your guess: $num")
        num
    }
    else{
        println("Wrong the number was: $randomNumber")
        println("your guess: $num")
        num
    }
}