import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList <T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) {
    super.remove(index);
  }

  public int sort() {

  }

  public boolean add(T value) {

  }
}
