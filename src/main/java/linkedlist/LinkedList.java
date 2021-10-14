package linkedlist;

public interface LinkedList<Data> {

    Data getFirst();

    Data getLast();

    void insertFirst(Data data);

    int getSize();

    void clear();
}
