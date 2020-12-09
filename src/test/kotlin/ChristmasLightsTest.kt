import com.mrz.tdd.christmas.LightsGrid
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ChristmasLightsTest {

    private lateinit var grid: LightsGrid


    @Before
    fun sutUp() {
        grid = LightsGrid(1000, 1000)

    }

    @Test
    fun `santa's instruction`() {
        grid.turnON(Pair(0, 0), Pair(999, 999))
        grid.toggle(Pair(0, 0), Pair(999, 0))
        grid.turnOFF(Pair(499, 499), Pair(500, 500))
        assertEquals(1001996, grid.totalBrightness())
    }

    @Test
    fun `start from  bottom right`() {
        grid.turnON(Pair(999, 999), Pair(0, 0))
        grid.toggle(Pair(999, 0), Pair(0, 0))
        grid.turnOFF(Pair(500, 500), Pair(499, 499))
       // grid.printGridLight()
        assertEquals(1001996, grid.totalBrightness())
    }

    @Test
    fun `calling turnON will return an exception IndexOutOfRange`() {
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.turnON(Pair(1000, 0), Pair(0, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.turnON(Pair(0, 1000), Pair(0, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.turnON(Pair(0, 0), Pair(1000, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.turnON(Pair(0, 0), Pair(0, 1000)) }
    }

    @Test
    fun `calling toggle will return an exception IndexOutOfRange`() {
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.toggle(Pair(1000, 0), Pair(0, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.toggle(Pair(0, 1000), Pair(0, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.toggle(Pair(0, 0), Pair(1000, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.toggle(Pair(0, 0), Pair(0, 1000)) }
    }

    @Test
    fun `calling turnOFF will return an exception IndexOutOfRange`() {
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.turnOFF(Pair(1000, 0), Pair(0, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.turnOFF(Pair(0, 1000), Pair(0, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.turnOFF(Pair(0, 0), Pair(1000, 0)) }
        assertFailsWith<ArrayIndexOutOfBoundsException> { grid.turnOFF(Pair(0, 0), Pair(0, 1000)) }
    }


}

