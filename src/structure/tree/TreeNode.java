package src.structure.tree;

import java.util.ArrayList;

/**
 * boolean charExists = false;
      if (currentNode.getNext().size() > 0) {
        for (TreeNode node: currentNode.getNext()) {
          if (str.charAt(index) == node.getData()) {
            charExists = true;
          }
        }
        if (!charExists) {
          currentNode.setNext(new TreeNode(str.charAt(index)));
        }
      }
      else {
        currentNode.setNext(new TreeNode(str.charAt(index)));
      }
 */

public class TreeNode {
  
  private ArrayList<TreeNode> next;
  private TreeNode prev;
  private char data;

  public TreeNode() {
    
  }

  public TreeNode(char data) {
    this.data = data;
  }

  public void setNext(TreeNode node) {
    this.next.add(node);
  }

  public ArrayList<TreeNode> getNext() {
    return this.next;
  }

  public void setPrev(TreeNode node) {
    this.prev = node;
  }

  public TreeNode getPrev() {
    return this.prev;
  }

  public void setData(char data) {
    this.data = data;
  }

  public char getData() {
    return this.data;
  }
}
