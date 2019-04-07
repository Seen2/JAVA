import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(3);
		ll.addLast(2);
		for (int i = 0; i < 30; i += 2) {
			ll.add(i);
		}
		System.out.print("\n initially: ");
		System.out.println(ll);

		Comparator<Integer> rll = Collections.reverseOrder();
		Collections.sort(ll, rll);
		System.out.print("aftersorting: ");
		for (int i : ll) {
			System.out.print(i + " ");
		}
		System.out.println("\n Sorted normal: " + ll);
		Collections.shuffle(ll);
		System.out.print("\n Shuffeled: " + ll);
		// for (int i : ll) {
		// System.out.print(i + " ");
		// }

		System.out.println("\nmax of list =" + Collections.max(ll));
		System.out.println("min of list =" + Collections.min(ll));

	}

}
