import java.util.NoSuchElementException;

public class GreatestQueue
{
    private Node start;
    private Node end;
    private int length;

    public GreatestQueue() {
        this.start = null;
        this.end = null;
        this.length = 0;
    }

    public int size() {
        return this.length;
    }

    public boolean contains(Object element) {
        Node aux = this.end;

        while (aux != null) {
            if (aux.getData() == element) {
                return true;
            }
            aux = aux.getNext();
        }

        return false;
    }

    // remove o elemento do topo da fila
    public void pop() throws NullPointerException {
        if (this.length == 0) {
            throw new NullPointerException("Empty Queue!");
        }

        this.start = this.start.getNext();
    }

    public int min() {
        Node aux = this.start;
        int min = (int) this.start.getData();

        while (aux != null) {

            if ((int) aux.getData() < min) {
                min = (int) aux.getData();
            }
            aux = aux.getNext();

        }

        return min;
    }

    // retorna o elemento mais recente adicionado
    public Object peek() throws NoSuchElementException {
        if (this.length == 0) {
            throw new NoSuchElementException("Empty Queue!");
        }

        return this.end.getData();
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    // método alternativo para size()
    public int count() {
        int length = 0;
        Node aux = this.start;
        
        while (aux != null) {
            length ++;
            aux = aux.getNext();
        }

        return length;
    }

    public void add(Object element) {
        Node node = new Node(element);
        if (this.end == null) {
            this.end = node;
        }
        else {
            this.end.setNext(node);
            this.end = node;
        }

        if (this.start == null) {
            this.start = node;
        }

        this.length ++;
    }

    public Object start() {
        return this.start.getData();
    }

    public String toString() {
        String info = "";
        Node aux = this.start;
        info += "(start)";

        while (aux != null) {
            info += "-[" + aux.getData() + "]";
            aux = aux.getNext();
        }
        info += "-(end)";

        return info;
    }

    public static void main(String[] args) {
        GreatestQueue q = new GreatestQueue();

        q.add(5);
        q.add(7);
        q.add(4);
        q.add(8);
        q.add(3);

        System.out.println(q.min());
    }
}
