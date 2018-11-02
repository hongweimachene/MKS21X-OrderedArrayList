import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public void set(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot set null");
    }
    super.set(index, value);
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    super.add(value);
  }

  public void add(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    super.add(index, value);
  }

  

}
