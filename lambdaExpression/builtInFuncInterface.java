import java.io.*;
import java.lang.*;
import java.util.function.*;
 

class builtInFuncInterface{
	public static void main(String args[]){
		Consumer<Integer> c=(t)->System.out.println("hello");
		c.accept(2);
	}

}
