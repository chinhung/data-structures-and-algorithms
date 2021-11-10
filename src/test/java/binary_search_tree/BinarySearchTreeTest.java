package binary_search_tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    @Test
    public void testAdd() {
        Comparator<Integer> naturalOrder = Comparator.comparingInt((Integer o) -> o);
        BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<>(naturalOrder);

        bst.add(10);

        assertEquals(1, bst.size());

        bst.add(20);

        assertEquals(2, bst.size());

        bst.add(5);

        assertEquals(3, bst.size());
    }

    @Test
    public void testValid() {
        Comparator<Integer> naturalOrder = Comparator.comparingInt((Integer o) -> o);
        BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<>(naturalOrder);

        assertTrue(bst.isValid(), "empty tree is not valid");

        bst.add(10);
        bst.add(20);
        bst.add(5);

        assertTrue(bst.isValid(), "tree is not valid");
    }

    @Test
    public void testTraverseBF() {
        Comparator<Integer> naturalOrder = Comparator.comparingInt((Integer o) -> o);
        BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<>(naturalOrder);

        //     10
        //   5    20
        //  3 6
        bst.add(10);
        bst.add(20);
        bst.add(5);
        bst.add(3);
        bst.add(6);
        List<Integer> container = new ArrayList<>();
        bst.traverseBF((data) -> container.add(data));

        assertArrayEquals(new Integer[]{ 10, 5, 20, 3, 6 }, container.toArray());
    }
}
