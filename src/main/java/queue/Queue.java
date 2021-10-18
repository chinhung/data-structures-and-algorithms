package queue;

public interface Queue<Data> {

    void add(Data data);

    Data remove();

    int getSize();
}
