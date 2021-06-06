package src.structure;

public class Node {
    
  private Object data;
  private Node next;

  public Node(Object element) {
      this.data = element;
  }

  public Object getData() {
      return this.data;
  }

  public void setData(Object element) {
      this.data = element;
  }

  public Node getNext() {
      return this.next;
  }

  public void setNext(Node next) {
      this.next = next;
  }
}
