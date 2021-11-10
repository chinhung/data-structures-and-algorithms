package binary_search_tree;

import java.util.Comparator;

public class BinarySearchTreeImpl<Data> implements BinarySearchTree<Data> {

    private Node<Data> root;
    private Comparator<Data> comparator;

    public BinarySearchTreeImpl(Comparator<Data> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void add(Data data) {
        Node<Data> newNode = new Node<>(data);
        if (root == null) {
            root = newNode;
            return;
        }
        root.add(newNode, comparator);
    }

    @Override
    public int size() {
        if (root == null) {
            return 0;
        }
        return root.size();
    }

    @Override
    public boolean isValid() {
        if (root == null) {
            return true;
        }

        Data min = null;
        Data max = null;
        return root.isValid(min, max, comparator);
    }
}
