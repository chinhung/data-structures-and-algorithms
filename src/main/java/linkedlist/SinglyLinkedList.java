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
        newNode.setNext(head);
        head = newNode;
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

    @Override
    public void removeFirst() {
        if (head == null) {
            return;
        }

        head = head.getNext();
    }

    @Override
    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.getNext() == null) {
            head = null;
            return;
        }

        SinglyNode<Data> previous = head;
        SinglyNode<Data> current = head.getNext();
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
    }

    @Override
    public Data get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index must be equal to zero, or larger than zero");
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("this list is empty");
        }

        SinglyNode<Data> current = head;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                break;
            }

            if (current.getNext() == null) {
                throw new IndexOutOfBoundsException("index is out of bounds, max index is " + (i - 1));
            }

            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public Data remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index must be equal to zero, or larger than zero");
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("this list is empty");
        }

        SinglyNode<Data> previous = null;
        SinglyNode<Data> current = head;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                break;
            }

            if (current.getNext() == null) {
                throw new IndexOutOfBoundsException("index is out of bounds, max index is " + (i - 1));
            }

            previous = current;
            current = current.getNext();
        }

        previous.setNext(current.getNext());
        return current.getData();
    }

    @Override
    public void insert(int index, Data data) {
        if (index < 0) {
            throw new IllegalArgumentException("index must be equal to zero, or larger than zero");
        }
        if (head == null && index != 0) {
            throw new IndexOutOfBoundsException("this list is empty");
        }

        SinglyNode<Data> previous = null;
        SinglyNode<Data> current = head;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                break;
            }

            if (current.getNext() == null) {
                throw new IndexOutOfBoundsException("index is out of bounds, max index is " + (i - 1));
            }

            previous = current;
            current = current.getNext();
        }

        SinglyNode<Data> newNode = new SinglyNode(data);
        if (previous == null) {
            newNode.setNext(head);
            head = newNode;
            return;
        }

        newNode.setNext(current);
        previous.setNext(newNode);
    }
}
