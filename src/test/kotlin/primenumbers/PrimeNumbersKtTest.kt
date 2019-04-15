package primenumbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


object PrimeNumbersKtTest{
    @Test
    fun should_return_true_if_passed_prime_number() {
        Assertions.assertTrue(isPrimeNumber(5))
    }
    
    @Test
    fun should_return_false_if_passed_not_prime_number_passed() {
        Assertions.assertFalse(isPrimeNumber(4))
    }
}