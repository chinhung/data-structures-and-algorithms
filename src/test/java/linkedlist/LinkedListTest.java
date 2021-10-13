package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @Test
    public void testInsertFirstAndGetFirst() {
        LinkedList<Integer> list = new LinkedListImpl<>();

        list.insertFirst(5);
        list.insertFirst(10);

        assertEquals(10, list.getFirst().getData());
    }

    @Test
    public void testGetSize() {
        LinkedList<Integer> list = new LinkedListImpl<>();
        assertEquals(0, list.getSize());

        list.insertFirst(5);
        assertEquals(1, list.getSize());

        list.insertFirst(10);
        assertEquals(2, list.getSize());
    }
}
