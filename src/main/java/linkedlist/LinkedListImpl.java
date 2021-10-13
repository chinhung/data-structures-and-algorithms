package linkedlist;

public class LinkedListImpl<Data> implements LinkedList<Data> {

    private Node<Data> head;

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
