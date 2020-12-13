import com.mrz.tdd.RomanConverter
import com.mrz.tdd.sumofoddnumbers.RowSumOddNumbers
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class RowSumOddNumbersTest {

    lateinit var rowSumOddNumbers: RowSumOddNumbers

    @Before
    fun setUp(){
        rowSumOddNumbers = RowSumOddNumbers()
    }

    @Test
    fun `should return 1 when enter 1`(){
        //give
        val enter = 1
        val expected = 1
        //when
        val result  = rowSumOddNumbers.rowSumOddNumbers(enter)
        //then
        assertEquals(expected,result)
    }

    @Test
    fun `should return 8 when enter 2`(){
        //give
        val enter = 2
        val expected = 8
        //when
        val result  = rowSumOddNumbers.rowSumOddNumbers(enter)
        //then
        assertEquals(expected,result)
    }
    @Test
    fun `should return 2197 when enter 13`(){
        //give
        val enter = 13
        val expected = 2197
        //when
        val result  = rowSumOddNumbers.rowSumOddNumbers(enter)
        //then
        assertEquals(expected,result)
    }


}