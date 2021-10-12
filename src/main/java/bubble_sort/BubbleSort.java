package bubble_sort;

import java.util.Comparator;

public interface BubbleSort<Element> {

    void sort(Element[] elements, Comparator<Element> comparator);
}
