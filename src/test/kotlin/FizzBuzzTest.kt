import com.mrz.tdd.fizzbuzz.FizzBuzz
import org.junit.Before
import org.junit.Test
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt
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
    fun `should return Fizz when enter 3`() {
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
    fun `should return Buzz when enter 5`() {
        //GIVE
        val enter = 5
        val fizzBuzzResult = "Buzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return Fizz when enter 6`() {
        //GIVE
        val enter = 6
        val fizzBuzzResult = "Fizz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return Fizz when enter 9`() {
        //GIVE
        val enter = 9
        val fizzBuzzResult = "Fizz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return Buzz when enter 10`() {
        //GIVE
        val enter = 10
        val fizzBuzzResult = "Buzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return Fizz when enter 12`() {
        //GIVE
        val enter = 12
        val fizzBuzzResult = "Fizz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return FizzBuzz when enter 15`() {
        //GIVE
        val enter = 15
        val fizzBuzzResult = "FizzBuzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }

    @Test
    fun `should return Buzz when enter 25`() {
        //GIVE
        val enter = 25
        val fizzBuzzResult = "Buzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }


    @Test
    fun `should return FizzBuzz when enter 75`() {
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
    fun `should return Buzz when enter 100`() {
        //GIVE
        val enter = 100
        val fizzBuzzResult = "Buzz"
        //WHEN
        val result = fizzBuzz.printValue(enter)
        //THEN
        assertEquals(fizzBuzzResult, result)
    }


}