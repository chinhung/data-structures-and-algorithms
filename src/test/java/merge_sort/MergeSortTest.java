package merge_sort;

import org.junit.jupiter.api.Test;
import selection_sort.SelectionSort;
import selection_sort.SelectionSortImpl;
import test_util.TestData;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testSortIntegerArray() {
        MergeSort<Integer> mergeSort = new MergeSortImpl<>();
        Comparator<Integer> naturalOrder = Comparator.comparingInt((Integer o) -> o);

        Integer[] unsorted = TestData.getUnsorted();
        mergeSort.sort(unsorted, naturalOrder);
        Integer[] actual = unsorted;

        assertArrayEquals(TestData.getSorted(), actual);
    }
}
