package selection_sort;

import java.util.Comparator;

public interface SelectionSort<Element> {

    void sort(Element[] elements, Comparator<Element> comparator);
}
