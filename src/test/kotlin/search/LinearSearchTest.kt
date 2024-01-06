package search

import org.junit.Test
import org.junit.Assert.assertEquals

internal class LinearSearchTest {

    private val searchAlgo = LinearSearch<Int>()

    @Test
    fun test_existed_element() {
        val array = arrayOf(1, 2, 3, 4, 5)
        assertEquals(true, searchAlgo.exists(array, 4))
    }

    @Test
    fun test_start_element() {
        val array = arrayOf(1, 11, 111, 1111, 11111)
        assertEquals(true, searchAlgo.exists(array, 1))
    }

    @Test
    fun test_last_element() {
        val array = arrayOf(0, 5, 10)
        assertEquals(true, searchAlgo.exists(array, 10))
    }

}