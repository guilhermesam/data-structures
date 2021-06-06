package src.structure.list;

public interface IList {
  public void add(Object element);
  public boolean remove(Object element);
  public boolean isEmpty();
  public int size();
  public boolean contains(Object element);
  @Override
  public String toString();
}
