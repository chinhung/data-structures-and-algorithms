package binary_search_tree;

import java.util.function.Consumer;

public interface BinarySearchTree<Data> {

    void add(Data data);

    int size();

    boolean isValid();

    boolean exists(Data data);

    void traverseBF(Consumer<Data> consumer);

    void traverseDF(Consumer<Data> consumer);
}
