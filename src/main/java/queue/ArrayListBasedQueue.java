package queue;

import java.util.ArrayList;

public class ArrayListBasedQueue<Data> implements Queue<Data> {

    private ArrayList<Data> arrayList;

    public ArrayListBasedQueue() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void add(Data data) {
        arrayList.add(data);
    }

    @Override
    public Data remove() {
        return arrayList.remove(0);
    }

    @Override
    public int getSize() {
        return arrayList.size();
    }
}
