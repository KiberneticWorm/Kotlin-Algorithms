package sorting

import org.junit.Test
import org.junit.Assert.assertEquals

internal class InsertionSortTest {

    @Test
    fun test_reversed_array() {
        val expected = TestUtils.list(1000)

        val actual = expected.reversed().toTypedArray()
        actual.insertionSort()

        assertEquals(expected, actual.toList())
    }

    @Test
    fun test_random_array() {
        val actual = TestUtils.randomArray(500)

        val expected = actual.sorted()

        actual.insertionSort()

        assertEquals(expected, actual.toList())
    }

    @Test
    fun test_shuffled_array() {
        val expected = TestUtils.sortedArray(1000)

        val actual = expected.copyOf()
        actual.shuffle()
        actual.insertionSort()

        assertEquals(expected.toList(), actual.toList())
    }

    @Test
    fun test_sorted_array() {
        val actual = TestUtils.sortedArray(1000)

        val expected = actual.toList()

        actual.insertionSort()

        assertEquals(expected, actual.toList())
    }

    @Test
    fun test_random_list() {
        val actual = TestUtils.mutableRandomList(5000)

        val expected = actual.sorted()

        actual.insertionSort()

        assertEquals(expected, actual)
    }

}