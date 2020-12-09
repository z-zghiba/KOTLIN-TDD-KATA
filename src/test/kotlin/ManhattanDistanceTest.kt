import com.mrz.tdd.manhattan.ManhattanDistance
import com.mrz.tdd.manhattan.Point
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class ManhattanDistanceTest {
    lateinit var manhattanDistance : ManhattanDistance

    @Before
    fun setUp(){
        manhattanDistance = ManhattanDistance()
    }

    @Test
    fun `should return 4,0 from Point(0,0 , 0,0) to Point(2,0 , 2,0)`() {
        //GIVE
        val pointA = Point(0.0 , 0.0)
        val pointB = Point(2.0,2.0)
        val expected = 4.0

        //WHEN
        val result = manhattanDistance.distance(pointA,pointB)
        //THEN
        assertEquals(expected, result)
    }
    @Test
    fun `should return 3,0 from Point(0,0 , 1,0) to Point(2,0 , 2,0)`() {
        //GIVE
        val pointA = Point(0.0 , 1.0)
        val pointB = Point(2.0,2.0)
        val expected = 3.0

        //WHEN
        val result = manhattanDistance.distance(pointA,pointB)
        //THEN
        assertEquals(expected, result)
    }

    @Test
    fun `should return 6,4 from Point(3,6 , 2,8) to Point(9,9 , 2,9)`() {
        //GIVE
        val pointA = Point(3.6 , 2.8)
        val pointB = Point(9.9,2.9)
        val expected = 6.4
        //WHEN
        val result = manhattanDistance.distance(pointA,pointB)
        //THEN
        assertEquals(expected, result)
    }
}