import java.util.*;
public class index{
  public static void main(String []args){
    int a[]={1,3,0,4};
    // System.out.println(a[-1]);
    //simple sort

    // Arrays.sort(a);
    // for(int e:a){
    //   System.out.println(e);
    // }

    // System.out.println(Arrays.toString(a));
    // Arrays.sort(a);
    // System.out.println(Arrays.toString(a));
    Arrays.asList(a);
    System.out.println(Arrays.toString(a));
    //binary search on array
    System.out.println("index of 3 is:"+Arrays.binarySearch(a,3));

    int []b={1,3,0,4};
    Arrays.sort(b);
    System.out.println("compare is:"+Arrays.equals(a,b));
    //copy
    b=Arrays.copyOf(a,a.length);
    System.out.println("compare is:"+Arrays.equals(a,b));

    //copy in range
    b=Arrays.copyOfRange(a,0,(a.length-2));
    System.out.println(Arrays.toString(b));

    //deep equals
    int c[][]={a,b},d[][]={b,a};
    System.out.println("deep compare is:"+Arrays.deepEquals(c,d));
    //deep tostring
    System.out.println(Arrays.deepToString(c));

    //fill
    Arrays.fill(c,a);
    System.out.println(Arrays.deepToString(c));

  }
}