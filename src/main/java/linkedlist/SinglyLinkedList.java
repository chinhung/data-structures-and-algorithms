package linkedlist;

public class SinglyLinkedList<Data> implements LinkedList<Data> {

    private Node<Data> head;

    @Override
    public int getSize() {
        if (head == null) {
            return 0;
        }

        Node<Data> current = head;
        int size = 1;
        while (current.getNext() != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public Data getFirst() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    @Override
    public Data getLast() {
        if (head == null) {
            return null;
        }

        Node<Data> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public void insertFirst(Data data) {
        SinglyNode<Data> newNode = new SinglyNode<>(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }
}
