package src.structure.tree;

public class DictionaryTree implements ITree {

  private TreeNode top;

  public DictionaryTree() {
    this.top = new TreeNode();
  }

  public void insert(String str) {
    TreeNode currentNode = this.top;
    for (int index = 0; index < str.length(); index++) {
      
    } 
  }

  public boolean check(String str) {
    return false;
  }

  public void delete(String str) {
    
  }

  public static void main(String[] args) {
    DictionaryTree dt = new DictionaryTree();
    dt.insert("Hello");
  }
}