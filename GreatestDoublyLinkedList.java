public class GreatestDoublyLinkedList {
    private DoubleNode head, tail;
    private int size;
    
    public GreatestDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object element) {
        DoubleNode node = new DoubleNode(element);

        if (isEmpty()) {
            this.head = node;
            this.tail = node;
            this.size++;
        }
        else {
            this.tail.setNext(node);
            node.setPrevious(tail);
            this.tail = node;
            tail.setNext(null);
            this.size++;
        }
        
    }

    // conta quantos elementos tem
    public int count() {
        int length = 0;
        DoubleNode aux = this.head;
        
        while (aux != null) {
            length ++;
            aux = aux.getNext();
        }

        return length;
    }

    public boolean contains(Object element) {
        DoubleNode aux = this.head;

        while (aux.getNext() != null) {
            if (aux.getData().equals(element)) {
                return true;
            }
            aux = aux.getNext();
        }

        return false;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public boolean remove(Object element) {
        DoubleNode aux = this.head;

        while (aux != null) {
            if (aux.getData().equals(element)) {
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
                return true;
            }
            aux = aux.getNext();
        }

        return false;
    }

    public String toString() {
        String info = "";
        DoubleNode aux = this.head;

        while (aux != null) {
            info += "[" + aux.getData() + "]";
            aux = aux.getNext();
        }

        return info;
    }

    public static void main(String[] args) {
        GreatestDoublyLinkedList dll = new GreatestDoublyLinkedList();
        dll.add(4);
        dll.add(3);
        dll.add(4);
        dll.add(3);
        dll.add(4);
        dll.add(3);
        dll.add(4);
        dll.add(3);

        System.out.println(dll.toString());
    }
}
