import java.text.Collator;
import java.util.*;

public class linkedList {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<String>();
    ll.add("Anmol");
    ll.add("Shintu");
    ll.add("Abhay");
    ll.add("Radha");
    System.out.println(ll);
    ll.sort(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Collator.getInstance().compare(o1, o2);
      }
    });
    System.out.println(ll);
    System.out.println(ll.peekFirst());
    System.out.println(ll.peek());
    System.out.println(ll);
    ll.remove(("shintu" == ll.get(0)) ? "Shintu" : "Abhay");
    System.out.println(ll);

  }
}