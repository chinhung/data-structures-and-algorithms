package linkedlist;

public class SinglyNode<Data> implements Node<Data> {

    private Data data;
    private Node<Data> next;

    SinglyNode(Data data) {
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
