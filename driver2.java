public class driver2 {
  public static void main(String[] args){
    NoNullArrayList x = new NoNullArrayList(8);
    OrderedArrayList y = new OrderedArrayList(10);
    try {
      //System.out.println(x.add(null));
      System.out.println(x.add(13));
      System.out.println(x);
      System.out.println(y.add(1));
      System.out.println(y.add(2));
      System.out.println(y.add(4));
      System.out.println(y);
      System.out.println(y.add(3));
      System.out.println(y);
      System.out.println(y.add(10));
      System.out.println(y.add(5));
      System.out.println(y);
      System.out.println(y.set(4,8));
      System.out.println(y);
      System.out.println(y.set(5, -1));
      System.out.println(y);
      System.out.println(y.add(6));
      System.out.println(y.set(3, "hello"));
      System.out.println(y);
      System.out.println(y.set(3, null));
      //System.out.println(y.add(null));
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }

  }
}
