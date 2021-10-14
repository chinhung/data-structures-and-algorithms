package linkedlist;

public class SinglyLinkedList<Data> implements LinkedList<Data> {

    private SinglyNode<Data> head;

    @Override
    public int getSize() {
        if (head == null) {
            return 0;
        }

        SinglyNode<Data> current = head;
        int size = 1;
        while (current.getNext() != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public Data getFirst() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    @Override
    public Data getLast() {
        SinglyNode<Data> last = getLastNode();
        if (last == null) {
            return null;
        }
        return last.getData();
    }

    private SinglyNode<Data> getLastNode() {
        if (head == null) {
            return null;
        }

        SinglyNode<Data> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void insertFirst(Data data) {
        SinglyNode<Data> newNode = new SinglyNode<>(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    @Override
    public void insertLast(Data data) {
        SinglyNode<Data> newNode = new SinglyNode<>(data);
        SinglyNode<Data> last = getLastNode();

        if (last == null) {
            head = newNode;
        } else {
            last.setNext(newNode);
        }
    }
}
