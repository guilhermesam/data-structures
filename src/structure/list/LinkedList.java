package src.structure.list;

import java.util.NoSuchElementException;
import src.structure.Node;

public class LinkedList implements IList {

    private Node header, tail;
    private int size;

    public LinkedList() {
        this.header = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Object element) {
        Node node = new Node(element);

        if (isEmpty()) {
            this.header = node;
        }

        else {
            this.tail.setNext(node);
        }
        this.tail = node;
        this.size ++;
    }

    public boolean remove(Object element) {
        if (this.size == 1 && this.header.getData().equals(element)) {
            this.header = null;
            this.tail = null;
            this.size--;
            return true;
        }

        if (this.header.getData().equals(element)) {
            this.header = this.header.getNext();
            this.size--;
            return true;
        }

        else {
            Node aux = this.header;
            Node next;
            while (aux != null) {
                next = aux.getNext();
                if (next.getData().equals(element)) {
                    aux.setNext(next.getNext());
                    this.size--;
                    return true;
                }
                aux = aux.getNext();
            }
            return false;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(Object element) {
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
