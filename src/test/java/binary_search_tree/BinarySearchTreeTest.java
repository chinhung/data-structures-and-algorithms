package binary_search_tree;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
