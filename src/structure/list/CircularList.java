package src.structure.list;

import java.util.NoSuchElementException;
import src.structure.Node;

public class CircularList {

    private Node header, tail;
    private int size;

    public CircularList() {
        this.header = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object element) {
        Node node = new Node(element);

        if (this.header == null) {
            this.header = node;
        } 
        
        else {
            tail.setNext(node);
        }

        this.tail = node;
        tail.setNext(this.header);

        this.size ++;
    }

    public boolean remove(Object element) {        
        if (size() == 1 && this.header.getData().equals(element)) {
            this.header = null;
            this.tail = null;
            this.size--;
            return true;
        }

        Node aux = this.header;
        if (this.header.getData().equals(element)) {
            this.header = this.header.getNext();
            this.tail.setNext(this.header);
            this.size--;
            return true;
        }

        else {
            Node next;
            while (aux.getNext() != this.header) {
                next = aux.getNext();
                if (aux.getNext().getData().equals(element)) {
                    aux.setNext(next.getNext());
                    this.size--;
                    return true;
                }
                aux = aux.getNext();
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(Object element) {
        Node aux = this.header;

        if (this.header == null) {
            throw new NoSuchElementException("Empty Circular List!");
        } 
        else {
            do {
                if (aux.getData() == element) {
                    return true;
                }
                aux = aux.getNext();
            }
            while (aux != this.header);
            return false;
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Empty List!";
        }

        Node aux = this.header;
        String data = "";
        
        do {
            data += "|" + aux.getData();
            aux = aux.getNext();
        }
        while (aux != this.header);

        data += "|";
        return data;
    }
}
