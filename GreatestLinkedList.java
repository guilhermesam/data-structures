import java.util.NoSuchElementException;

public class GreatestLinkedList {

    private Node header, tail;
    private int size;

    public GreatestLinkedList() {
        this.header = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object element) {
        Node node = new Node(element);

        if (isEmpty()) {
            this.header = node;
            this.tail = node;
            this.size ++;
        }

        else {
            this.tail.setNext(node);
            this.tail = node;
            this.size ++;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


    public int size() {
        return this.size;
    }

    public boolean contains(Object element) throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty Linked List!");        
        }

        else {
            Node aux = this.header;
            while (aux.getNext() != null) {
                if (aux.getData() == element) {
                    return true;
                }
                aux = aux.getNext();
            }
            return false;
        }
    }

    @Override
    public String toString() {
        String data = "";
        Node aux = this.header;

        while (aux != null) {
            data += "|" + aux.getData();
            aux = aux.getNext();
        }

        data += "|";
        return data;
    }
}
