import com.mrz.tdd.stock.StockList
import org.junit.Test
import kotlin.test.assertEquals

class StockListTest {

    private fun testing(lstOfArt: Array<String>, lstOfCat: Array<String>, expect: String) {
        val actual: String = StockList.stockSummary(lstOfArt, lstOfCat)
        assertEquals(expect, actual)
    }


    @Test
    fun `first test`() {
        val b = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
        val c = arrayOf("A", "B", "C", "D")
        val res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
        testing(b, c, res)

    }

    @Test
    fun `second test`() {
        val b = arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
        val c = arrayOf("A", "B")
        val res = "(A : 200) - (B : 1140)"
        testing(b, c, res)

    }

}