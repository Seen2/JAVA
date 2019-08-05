import java.util.*;

class arrayList {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(20);
    arr.add(30);
    arr.add(10);
    arr.add(10);
    arr.add(10);
    System.out.println(arr);
    System.out.println(arr.size());
    System.out.println(arr.get(2));// index
    arr.add(0, 0);// index,item
    System.out.println(arr);
    arr.remove(0); // removes index wise
    System.out.println(arr);
    System.out.println(arr.lastIndexOf(10));
    // ListIterator list = arr.listIterator(arr.size());
    // arr.forEach(c -> {
    // System.out.println(c);

    // });
    for (int c : arr) {
      System.out.println(c);
    }

  }

}
