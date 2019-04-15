package primenumbers

fun isPrimeNumber(number: Int): Boolean {
    var isPrime = true
    
    for (i in 2..number / 2){
        if (number % i == 0){
            isPrime = false
            break
        }
    }
    return isPrime
}