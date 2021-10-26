package merge_sort;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSortImpl<Element> implements MergeSort<Element> {

    @Override
    public void sort(Element[] elements, Comparator<Element> comparator) {
        sort(elements, 0, elements.length, comparator);
    }

    private void sort(Element[] elements, int start, int end, Comparator<Element> comparator) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        sort(elements, start, mid, comparator);
        sort(elements, mid, end, comparator);
        merge(elements, start, mid, end, comparator);
    }

    private void merge(Element[] elements, int start, int mid, int end, Comparator<Element> comparator) {
        if (comparator.compare(elements[mid - 1], elements[mid]) <= 0) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIdx = 0;
        Element[] temp = Arrays.copyOfRange(elements, start, end);
        while (i < mid || j < end) {
            if (i < mid && j < end) {
                temp[tempIdx++] = comparator.compare(elements[i], elements[j]) <= 0 ? elements[i++] : elements[j++];
            } else if (i < mid) {
                System.arraycopy(elements, i, temp, tempIdx, mid - i);
                break;
            } else {
                break;
            }
        }

        System.arraycopy(temp, 0, elements, start, temp.length);
    }
}
