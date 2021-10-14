package linkedlist;

class SinglyNode<Data> {

    private Data data;
    private SinglyNode<Data> next;

    SinglyNode(Data data) {
        this.data = data;
    }

    Data getData() {
        return data;
    }

    SinglyNode<Data> getNext() {
        return next;
    }

    void setNext(SinglyNode<Data> next) {
        this.next = next;
    }
}
