public class DoubleNode
{
    private Object data;
    private DoubleNode next;
    private DoubleNode previous;

    public DoubleNode(Object element) {
        this.data = element;
        this.next = null;
        this.previous = null;
    }

    public void setData(Object element) {
        this.data = element;
    }

    public void setPrevious(DoubleNode element) {
        this.previous = element;
    }

    public void setNext(DoubleNode element) {
        this.next = element;
    }

    public Object getData() {
        return this.data;
    }

    public DoubleNode getPrevious() {
        return this.previous;
    }

    public DoubleNode getNext() {
        return this.next;
    }
}
