package selection_sort;

import org.junit.jupiter.api.Test;
import test_util.TestData;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        SelectionSort<Integer> selectionSort = new SelectionSortImpl<>();
        Comparator<Integer> naturalOrder = Comparator.comparingInt((Integer o) -> o);

        Integer[] unsorted = TestData.getUnsorted();
        selectionSort.sort(unsorted, naturalOrder);
        Integer[] actual = unsorted;

        assertArrayEquals(TestData.getSorted(), actual);
    }
}
