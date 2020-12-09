import com.mrz.tdd.RomanConverter
import kotlin.test.Test
import kotlin.test.assertEquals

class RomanConverterTest {

    @Test
    fun `should return I when convert 1`(){
        //give
        val valueToConvert = 1
        val convertResult = "I"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return II when convert 2`(){
        //give
        val valueToConvert = 2
        val convertResult = "II"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }


    @Test
    fun `should return III when convert 3`(){
        //give
        val valueToConvert = 3
        val convertResult = "III"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return V when convert 5`(){
        //give
        val valueToConvert = 5
        val convertResult = "V"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return IV when convert 4`(){
        //give
        val valueToConvert = 4
        val convertResult = "IV"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return VI when convert 6`(){
        //give
        val valueToConvert = 6
        val convertResult = "VI"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return VIII when convert 8`(){
        //give
        val valueToConvert = 8
        val convertResult = "VIII"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }
    @Test
    fun `should return X when convert 10`(){
        //give
        val valueToConvert = 10
        val convertResult = "X"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }
    @Test
    fun `should return IX when convert 9`(){
        //give
        val valueToConvert = 10
        val convertResult = "X"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return XXIV when convert 24`(){
        //give
        val valueToConvert = 24
        val convertResult = "XXIV"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return XXXV when convert 35`(){
        //give
        val valueToConvert = 24
        val convertResult = "XXIV"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }




    @Test
    fun `should return XLIX when convert 49`(){
        //give
        val valueToConvert = 24
        val convertResult = "XXIV"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return LVI when convert 56`(){
        //give
        val valueToConvert = 56
        val convertResult = "LVI"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return LXIX when convert 69`(){
        //give
        val valueToConvert = 69
        val convertResult = "LXIX"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return XCIX when convert 99`(){
        //give
        val valueToConvert = 99
        val convertResult = "XCIX"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return MCMXXV when convert 1925`(){
        //give
        val valueToConvert = 1925
        val convertResult = "MCMXXV"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }


    @Test
    fun `should return MCMXCIX when convert 1999`(){
        //give
        val valueToConvert = 1999
        val convertResult = "MCMXCIX"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }

    @Test
    fun `should return MMIII when convert 2003`(){
        //give
        val valueToConvert = 2003
        val convertResult = "MMIII"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }
    @Test
    fun `should return MMMCCLXXIX when convert 3279`(){
        //give
        val valueToConvert = 3279
        val convertResult = "MMMCCLXXIX"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }
    @Test
    fun `should return MMMM when convert 4000`(){
        //give
        val valueToConvert = 4000
        val convertResult = "MMMM"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }
    @Test
    fun `should return vMDLXXXIX when convert 6589`(){
        //give
        val valueToConvert = 6589
        val convertResult = "vMDLXXXIX"
        //when
        val romanConverter = RomanConverter()
        val result  = romanConverter.convert(valueToConvert)
        //then
        assertEquals(convertResult,result)
    }
}