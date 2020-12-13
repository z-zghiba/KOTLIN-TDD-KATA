import com.mrz.tdd.squareddivisors.SumSquaredDivisors
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class SumSquaredDivisorsTest {

    lateinit var squaredDivisors: SumSquaredDivisors

    @Before
    fun setUp() {
        squaredDivisors = SumSquaredDivisors()
    }

    @Test
    fun basicTests1() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", squaredDivisors.listSquared(1, 250))
    }


    @Test
    fun basicTests2() {
        assertEquals("[[42, 2500], [246, 84100]]", squaredDivisors.listSquared(42, 250))
    }

    @Test
    fun basicTests3() {
        assertEquals(
            "[[6237, 45024100], [9799, 96079204], [9855, 113635600]]",
            squaredDivisors.listSquared(5000, 10000)
        )
    }

}