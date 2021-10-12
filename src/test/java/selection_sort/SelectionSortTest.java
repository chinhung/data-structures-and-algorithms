package selection_sort;

import org.junit.jupiter.api.Test;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    public Integer[] getUnsorted() {
        return new Integer[]{36, -55, 0, -1, 80, -17, 1};
    }

    public Integer[] getSorted() {
        return new Integer[]{-55, -17, -1, 0, 1, 36, 80};
    }

    @Test
    public void testSelectionSort() {
        SelectionSort<Integer> selectionSort = new SelectionSortImpl<>();
        Comparator<Integer> naturalOrder = Comparator.comparingInt((Integer o) -> o);

        Integer[] unsorted = getUnsorted();
        selectionSort.sort(unsorted, naturalOrder);
        Integer[] actual = unsorted;

        assertArrayEquals(getSorted(), actual);
    }
}
