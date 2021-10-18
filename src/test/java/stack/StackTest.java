package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    @Test
    public void testAddAndRemove() {
        Stack<Integer> stack = new ArrayListBasedStack<>();

        stack.add(10);
        assertEquals(1, stack.getSize());

        stack.remove();
        assertEquals(0, stack.getSize());
    }

    @Test
    public void testFirstInLastOut() {
        Stack<Integer> stack = new ArrayListBasedStack<>();
        Integer firstIn = 1;
        Integer secondIn = 2;
        stack.add(firstIn);
        stack.add(secondIn);

        Integer firstOut = stack.remove();
        Integer secondOut = stack.remove();

        assertEquals(firstIn, secondOut);
        assertEquals(secondIn, firstOut);
    }
}
