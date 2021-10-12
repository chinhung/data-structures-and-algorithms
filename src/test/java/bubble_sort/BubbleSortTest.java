package bubble_sort;

import org.junit.jupiter.api.Test;
import test_util.TestData;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testSortIntegerArray() {
        BubbleSort<Integer> bubbleSort = new BubbleSortImpl<>();
        Comparator<Integer> naturalOrder = Comparator.comparingInt((Integer o) -> o);

        Integer[] unsorted = TestData.getUnsorted();
        bubbleSort.sort(unsorted, naturalOrder);
        Integer[] actual = unsorted;

        assertArrayEquals(TestData.getSorted(), actual);
    }
}
