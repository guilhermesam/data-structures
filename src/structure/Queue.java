package src.structure;

import java.util.NoSuchElementException;

public class Queue {

    private Node start;
    private Node end;
    private int size;

    public Queue() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }
    
    public void add(Object element) {
        Node node = new Node(element);

        if (this.size == 0) {
            this.start = node;
            this.end = node;
        }
        else {
            this.end.setNext(node);
            this.end = node;
        }
        this.size++;
    }

    public int size() {
        return this.size;
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

    public void pop() throws NullPointerException {
        if (this.size == 0) {
            throw new NullPointerException("Empty Queue!");
        }

        this.start = this.start.getNext();
    }

    public int min() throws IllegalArgumentException {
        try {
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
        catch (Exception e) {
            throw new IllegalArgumentException("Queue has non-integers elements");
        }
    }

    public Object peek() throws NoSuchElementException {
        if (this.size == 0) {
            throw new NoSuchElementException("Empty Queue!");
        }

        return this.start.getData();
    }

    public boolean isEmpty() {
        return this.size == 0;
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
}
