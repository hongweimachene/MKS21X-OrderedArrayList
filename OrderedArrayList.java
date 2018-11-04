public class OrderedArrayList <T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public int sort(T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    int index = 0;
    for (int i = 0; i < size(); i++) {
      if (get(i).compareTo(value) < 0) {
        index++;
      }
    }
    return index;
  }

  public boolean add(T value) {
    super.add(sort(value), value);
    return true;
  }

  public void add(int index, T value) {
    add(value);
  }

  public T set(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    T removed = get(index);
    remove(get(index));
    add(value);
    return removed;
  }
}
