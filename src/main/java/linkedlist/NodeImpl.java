package linkedlist;

public class NodeImpl<Data> implements Node<Data> {

    private Data data;
    private Node<Data> next;

    NodeImpl(Data data) {
        this.data = data;
    }

    void setNext(Node<Data> next) {
        this.next = next;
    }

    @Override
    public Data getData() {
        return data;
    }

    @Override
    public Node<Data> getNext() {
        return next;
    }
}
