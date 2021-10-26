package merge_sort;

import java.util.Comparator;

public interface MergeSort<Element> {

    void sort(Element[] elements, Comparator<Element> comparator);
}
