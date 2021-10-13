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
}
