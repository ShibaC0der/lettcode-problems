package arrays

import arrays.GreatestElementOnRightSide.replaceElements
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class GreatestElementOnRightSideTest {
    @Test
    fun test1() {
        assertArrayEquals(intArrayOf(18, 6, 6, 6, 1, -1), replaceElements(intArrayOf(17, 18, 5, 4, 6, 1)))
    }

    @Test
    fun test2() {
        assertArrayEquals(intArrayOf(-1), replaceElements(intArrayOf(400)))
    }
}