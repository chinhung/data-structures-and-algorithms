package selection_sort;

import java.util.Comparator;

public interface SelectionSort<Element> {

    Element[] sort(Element[] elements, Comparator<Element> comparator);
}
