package linkedlist;

public interface LinkedList<Data> {

    Node<Data> getFirst();

    Node<Data> getLast();

    void insertFirst(Data data);

    int getSize();
}
