package bubble_sort;

import java.util.Comparator;

public class BubbleSortImpl<Element> implements BubbleSort<Element> {

    @Override
    public void sort(Element[] elements, Comparator<Element> comparator) {
        for (int i = 0; i < elements.length; i++) {

            for (int j = 0; j < elements.length - i - 1; j++) {
                if (comparator.compare(elements[j], elements[j + 1]) > 0) {
                    swap(elements, j, j + 1);
                }
            }
        }
    }

    private void swap(Element[] elements, int a, int b) {
        Element temp = elements[a];
        elements[a] = elements[b];
        elements[b] = temp;
    }
}
