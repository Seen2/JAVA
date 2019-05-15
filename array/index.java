import java.util.Arrays;
public class index{
  public static void main(String []args){
    int a[]={1,3,0,4};
    //simple sort

    // Arrays.sort(a);
    // for(int e:a){
    //   System.out.println(e);
    // }

    System.out.println(Arrays.toString(a));
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    Arrays.asList(a);
    System.out.println(Arrays.toString(a));
  }
}