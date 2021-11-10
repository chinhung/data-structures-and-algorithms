package binary_search_tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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

    @Override
    public void traverseBF(Consumer<Data> consumer) {
        if (root == null) {
            return;
        }

        List<Node<Data>> level = new ArrayList<>();
        List<Node<Data>> nextLevel = new ArrayList<>();
        level.add(root);

        while (level.size() > 0) {

            for (int i = 0; i < level.size(); i++) {
                Node<Data> node = level.get(i);

                if (node.getLeft() != null) {
                    nextLevel.add(node.getLeft());
                }

                if (node.getRight() != null) {
                    nextLevel.add(node.getRight());
                }

                consumer.accept(node.getData());
            }

            level = nextLevel;
            nextLevel = new ArrayList<>();
        }
    }

    @Override
    public void traverseDF(Consumer<Data> consumer) {
        if (root == null) {
            return;
        }

        traverseDF(root, consumer);
    }

    private void traverseDF(Node<Data> node, Consumer<Data> consumer) {
        consumer.accept(node.getData());

        if (node.getLeft() != null) {
            traverseDF(node.getLeft(), consumer);
        }

        if (node.getRight() != null) {
            traverseDF(node.getRight(), consumer);
        }
    }
}
