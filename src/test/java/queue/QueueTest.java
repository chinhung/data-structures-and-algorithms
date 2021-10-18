package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

    @Test
    public void testAddAndRemove() {
        Queue queue = new ArrayBasedQueue(10);

        queue.add(10);
        assertEquals(1, queue.getSize());

        queue.remove();
        assertEquals(0, queue.getSize());
    }

    @Test
    public void testFirstInFirstOut() {
        Queue queue = new ArrayBasedQueue(10);
        Integer firstIn = 1;
        Integer secondIn = 2;
        queue.add(firstIn);
        queue.add(secondIn);

        Integer firstOut = queue.remove();
        Integer secondOut = queue.remove();

        assertEquals(firstIn, firstOut);
        assertEquals(secondIn, secondOut);
    }
}
