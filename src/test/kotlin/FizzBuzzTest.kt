import com.mrz.tdd.fizzbuzz.FizzBuzz
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    lateinit var fizzBuzz: FizzBuzz

    @Before
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun `should return 1 when enter 1`() {
        //GIVE
        val enter = 1
        val fizzBuzzResult = "1"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 3 when enter Fizz`() {
        //GIVE
        val enter = 3
        val fizzBuzzResult = "Fizz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 4 when enter 4`() {
        //GIVE
        val enter = 4
        val fizzBuzzResult = "4"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 5 when enter Buzz`() {
        //GIVE
        val enter = 5
        val fizzBuzzResult = "Buzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 6 when enter Fizz`() {
        //GIVE
        val enter = 6
        val fizzBuzzResult = "Fizz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 9 when enter Fizz`() {
        //GIVE
        val enter = 9
        val fizzBuzzResult = "Fizz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 10 when enter Buzz`() {
        //GIVE
        val enter = 10
        val fizzBuzzResult = "Buzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 12 when enter Fizz`() {
        //GIVE
        val enter = 12
        val fizzBuzzResult = "Fizz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 15 when enter FizzBuzz`() {
        //GIVE
        val enter = 15
        val fizzBuzzResult = "FizzBuzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 25 when enter Buzz`() {
        //GIVE
        val enter = 25
        val fizzBuzzResult = "Buzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }


    @Test
    fun `should return 75 when enter FizzBuzz`() {
        //GIVE
        val enter = 75
        val fizzBuzzResult = "FizzBuzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 98 when enter 98`() {
        //GIVE
        val enter = 98
        val fizzBuzzResult = "98"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return 100 when enter Buzz`() {
        //GIVE
        val enter = 100
        val fizzBuzzResult = "Buzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }


}