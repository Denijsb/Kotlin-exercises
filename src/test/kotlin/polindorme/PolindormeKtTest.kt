package polindorme

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

object PolindormeKtTest {
    
    @Test
    fun should_find_polindorme() {
        //given
        val word = "racecar"
        //then
        Assertions.assertTrue(isPolindorme(word))
    }
    @Test
    fun should_not_return_word_if_not_polindorme() {
        //given
        val word = "water"
        //then
        Assertions.assertFalse(isPolindorme(word))
    }

}
