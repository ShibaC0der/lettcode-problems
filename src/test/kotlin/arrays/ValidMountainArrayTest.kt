package arrays

import arrays.ValidMountainArray.validMountainArray
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValidMountainArrayTest {
    @Test
    fun test1() {
        test(intArrayOf(2, 1), expected = false)
    }

    @Test
    fun test2() {
        test(intArrayOf(3, 5, 5), expected = false)
    }

    @Test
    fun test3() {
        test(intArrayOf(0, 3, 2, 1), expected = true)
    }


    private fun test(array: IntArray, expected: Boolean) {
        assertEquals(expected, validMountainArray(array), "Input: ${array.contentToString()}")
    }
}
