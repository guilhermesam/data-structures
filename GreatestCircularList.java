import java.util.NoSuchElementException;

public class GreatestCircularList {

    private Node header, tail;
    private int size;

    public GreatestCircularList() {
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

    public void remove() throws NullPointerException {
        Node aux = this.header;

        if (size() == 1) {
            this.header = null;
            this.tail = null;
        }

        else {
            while (aux.getNext() != this.tail) {
                aux = aux.getNext();
            }
            this.tail = aux;
            this.tail.setNext(this.header);
        }

        this.size --;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(Object element) throws NoSuchElementException {
        Node aux = this.header;

        if (this.header == null) {
            throw new NoSuchElementException("Empty Circular List!");
        } 
        else {
            // aux assume o valor do próximo nodo de header
            do {
                if (aux.getData() == element) {
                    return true;
                }
                aux = aux.getNext();
            }
            // termina o loop quando aux voltar a assumir o valor de
            // header, ou seja, quando o círculo for completado
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
    
    public static void main(String[] args) {
        
        GreatestCircularList gl = new GreatestCircularList();
        gl.add(4);
        gl.add(5);
        gl.add(57);
        gl.add(21);
        gl.add(111);

        System.out.println(gl.toString());
    }
}