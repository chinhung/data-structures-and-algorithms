package linkedlist;

public interface LinkedList<Data> {

    Data getFirst();

    Data getLast();

    void insertFirst(Data data);

    void insertLast(Data data);

    int getSize();

    void clear();

    void removeFirst();

    void removeLast();

    Data get(int index);

    Data remove(int index);
}
