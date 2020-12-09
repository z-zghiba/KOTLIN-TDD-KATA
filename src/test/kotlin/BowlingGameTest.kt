import com.mrz.tdd.bowling.Game
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals


//http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata
class BowlingGameTest {

    private lateinit var game: Game

    @Before
    fun setUp() {
        game = Game()
    }

    private fun rollMany(n: Int, pins: Int) {
        for (i in 1..n) game.roll(pins)
    }

    private fun rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private fun rollStrike() {
        game.roll(10);
    }

    @Test
    fun testGutterGame() {
        rollMany(20, 0)
        //THEN
        assertEquals(0, game.score())
    }

    @Test
    fun testAllOnes() {
        rollMany(20, 1)
        //THEN
        assertEquals(20, game.score())
    }

    @Test
    fun testOneSpare() {
        rollSpare()
        game.roll(3)
        rollMany(17, 0)
        //THEN
        assertEquals(16, game.score())
    }

    @Test
    fun testOneStrike() {
        rollStrike()
        game.roll(3)
        game.roll(4)
        rollMany(16, 0)
        //THEN
        assertEquals(24, game.score())
    }

    @Test
    fun testPerfectGame() {
        rollMany(12, 10)
        //THEN
        assertEquals(300, game.score())
    }


}