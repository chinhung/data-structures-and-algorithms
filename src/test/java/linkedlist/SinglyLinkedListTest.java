package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    @Test
    public void testInsertFirstAndGetFirst() {
        LinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertFirst(5);
        list.insertFirst(10);

        assertEquals(10, list.getFirst());
    }

    @Test
    public void testInsertLastAndGetLast() {
        LinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertLast(5);
        list.insertLast(10);

        assertEquals(10, list.getLast());
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

    @Test
    public void testRemoveFirst() {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertFirst(5);
        list.insertFirst(10);

        list.removeFirst();

        assertEquals(1, list.getSize());
        assertEquals(5, list.getFirst());
    }

    @Test
    public void testRemoveLast() {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertLast(5);
        list.insertLast(10);

        list.removeLast();

        assertEquals(1, list.getSize());
        assertEquals(5, list.getLast());
    }

    @Test
    public void testGet() {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertFirst(5);
        list.insertFirst(10);

        Integer atZero = list.get(0);
        Integer atOne = list.get(1);

        assertEquals(10, atZero);
        assertEquals(5, atOne);
    }

    @Test
    public void testGet_NegativeIdx() {
        LinkedList<Integer> list = new SinglyLinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> {
            list.get(-1);
        });
    }

    @Test
    public void testGet_IndexOutOfBounds() {
        LinkedList<Integer> list = new SinglyLinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(0);
        });

        list.insertFirst(5);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(1);
        });
    }

    @Test
    public void testRemove() {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);

        Integer removed = list.remove(1);

        assertEquals(10, removed);
        assertEquals(15, list.get(0));
        assertEquals(5, list.get(1));
    }

    @Test
    public void testRemove_NegativeIdx() {
        LinkedList<Integer> list = new SinglyLinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> {
            list.remove(-1);
        });
    }

    @Test
    public void testRemove_IndexOutOfBounds() {
        LinkedList<Integer> list = new SinglyLinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(0);
        });

        list.insertFirst(5);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(1);
        });
    }
}
