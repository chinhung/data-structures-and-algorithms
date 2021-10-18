package stack;

public interface Stack<Data> {

    void add(Data data);

    Data remove();

    int getSize();
}
