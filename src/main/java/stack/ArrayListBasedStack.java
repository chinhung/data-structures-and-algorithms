package stack;

import java.util.ArrayList;

public class ArrayListBasedStack<Data> implements Stack<Data> {

    private ArrayList<Data> arrayList;

    public ArrayListBasedStack() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void add(Data data) {
        arrayList.add(data);
    }

    @Override
    public Data remove() {
        return arrayList.remove(arrayList.size() - 1);
    }

    @Override
    public int getSize() {
        return arrayList.size();
    }
}
