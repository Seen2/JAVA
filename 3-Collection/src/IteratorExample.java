import java.util.*;

public class IteratorExample {

  public static void main(String[] args) {

    ArrayList al = new ArrayList();
    for (int i = 1; i < 30; i += 2) {
      String e = "" + i;
      al.add(e);
    }
    System.out.println(al);

    Iterator it = al.iterator();
    while (it.hasNext()) { // each time iter get updated
      Object element = it.next();
      System.out.print(element + " ");
    }
    while (it.hasNext()) {
      Object element = it.next();
      System.out.print(element + "+ ");
    }
    System.out.println();

    ListIterator itr = al.listIterator();
    while (itr.hasNext()) {
      // Object e = itr.next();
      itr.set(itr.next() + "+");

    }
    System.out.println("\n itr=" + al);
    // while (itr.hasNext()) { // each time iter get updated
    // Object element = itr.next();
    // System.out.print(element + "ok ");
    // }
  }

}