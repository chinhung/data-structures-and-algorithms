package linkedlist;

import java.util.function.Consumer;

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

    void insert(int index, Data data);

    void forEach(Consumer<Data> consumer);
}
