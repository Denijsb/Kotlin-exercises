package numberguesinggame
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

object NumberGuesingGameKtTest{
    @Test
    fun should_return_number() {
        //given
        val num: Int = 5
        //when
        game(num)
        //then
        Assertions.assertEquals(5, game(num))
    }
}