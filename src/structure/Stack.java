package src.structure;

import java.util.NoSuchElementException;

public class Stack {
  
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        while (this.top != null) {
            this.pop();
        }
    }

    public void push(Object element) {
        Node old = this.top;
        this.top = new Node(element);
        this.top.setNext(old);
        this.size++;
    }

    public Object pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty stack!");
        }
        Object data = this.top.getData();
        this.top = top.getNext();
        this.size--;

        return data;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(Object element) {
        Node aux = this.top;
        while (aux != null) {
            if (aux.getData() == element) {
                return true;
            }
            aux = aux.getNext();
        }

        return false;
    }

    public String toString() {
        String info = "";

        Node aux = this.top;
        while (aux != null) {
            info += "[" + aux.getData() + "]\n";
            aux = aux.getNext();
        }

        return info;
    }
}
