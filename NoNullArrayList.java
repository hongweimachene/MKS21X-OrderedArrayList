import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot set null");
    }
    super.set(index, value);
    return value;
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    super.add(value);
    return true;
  }

  public void add(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    super.add(index, value);
  }
}
