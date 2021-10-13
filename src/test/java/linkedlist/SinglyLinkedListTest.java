package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    @Test
    public void testInsertFirstAndGetFirst() {
        LinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertFirst(5);
        list.insertFirst(10);

        assertEquals(10, list.getFirst().getData());
    }

    @Test
    public void testGetLast() {
        LinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertFirst(5);
        list.insertFirst(10);

        assertEquals(5, list.getLast().getData());
    }

    @Test
    public void testGetSize() {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        assertEquals(0, list.getSize());

        list.insertFirst(5);
        assertEquals(1, list.getSize());

        list.insertFirst(10);
        assertEquals(2, list.getSize());
    }

    @Test
    public void testClear() {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertFirst(5);
        list.insertFirst(10);

        list.clear();

        assertEquals(0, list.getSize());
        assertNull(list.getFirst());
        assertNull(list.getLast());
    }
}
