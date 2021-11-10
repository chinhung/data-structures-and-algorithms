package binary_search_tree;

import java.util.Comparator;

class Node<Data> {

    private Data data;

    private Node<Data> left;
    private Node<Data> right;

    public Node(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Node<Data> getLeft() {
        return left;
    }

    public void setLeft(Node<Data> left) {
        this.left = left;
    }

    public Node<Data> getRight() {
        return right;
    }

    public void setRight(Node<Data> right) {
        this.right = right;
    }

    public int size() {
        int itself = 1;
        int leftSize = 0;
        int rightSize = 0;

        if (left != null) {
            leftSize = left.size();
        }

        if (right != null) {
            rightSize = right.size();
        }

        return itself + leftSize + rightSize;
    }

    public void add(Node<Data> newNode, Comparator<Data> comparator) {
        if (data.equals(newNode.getData())) {
            return;
        }

        if (comparator.compare(newNode.getData(), data) > 0) {
            if (right == null) {
                right = newNode;
                return;
            }
            right.add(newNode, comparator);
        }

        if (comparator.compare(newNode.getData(), data) < 0) {
            if (left == null) {
                left = newNode;
                return;
            }
            left.add(newNode, comparator);
        }
    }

    public boolean isValid(Data min, Data max, Comparator<Data> comparator) {
        if (min != null && comparator.compare(data, min) < 0) {
            return false;
        }

        if (max != null && comparator.compare(data, max) > 0) {
            return false;
        }

        boolean leftValid = true;
        boolean rightValid = true;
        if (left != null) {
            leftValid = left.isValid(min, data, comparator);
        }
        if (right != null) {
            rightValid = right.isValid(data, max, comparator);
        }
        return leftValid && rightValid;
    }

    public boolean exists(Data data, Comparator<Data> comparator) {
        if (this.data.equals(data)) {
            return true;
        }

        if (left != null && comparator.compare(data, this.data) < 0) {
            return left.exists(data, comparator);
        }

        if (right != null && comparator.compare(data, this.data) > 0) {
            return right.exists(data, comparator);
        }

        return false;
    }
}
