package selection_sort;

import java.util.Comparator;

public class SelectionSortImpl<Element> implements SelectionSort<Element> {

    @Override
    public void sort(Element[] elements, Comparator<Element> comparator) {
        for (int i = 0; i < elements.length; i++) {

            int mini = i;
            for (int j = i + 1; j < elements.length; j++) {

                if (comparator.compare(elements[mini], elements[j]) > 0) {
                    mini = j;
                }
            }

            if (mini != i) {
                swap(elements, i, mini);
            }
        }
    }

    private void swap(Element[] elements, int a, int b) {
        Element temp = elements[a];
        elements[a] = elements[b];
        elements[b] = temp;
    }
}
