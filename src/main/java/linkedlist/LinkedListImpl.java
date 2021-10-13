package linkedlist;

public class LinkedListImpl<Data> implements LinkedList<Data> {

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
    public Node<Data> getFirst() {
        return head;
    }

    @Override
    public void insertFirst(Data data) {
        NodeImpl<Data> newNode = new NodeImpl<>(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }
}
