import java.io.*;
import java.lang.*;
import java.util.function.*; 

class builtInFuncInterface{
	public static void main(String args[]){
		Consumer<Integer> c=(t)->System.out.println("hello, "+t);
		c.accept(2);

		Function<Integer,String> f=(num)-> {
			return "Square of "+num+"="+(num*num);
		};
		System.out.println(f.apply(3));

		Predicate<Integer > p=num->{
			return num>=0;
		};

		System.out.println(p.test(-5)?"Positive":"Negative");

		Supplier<String> s=()->{

			return "I am Supplier";
		};

		System.out.println(s.get());

	}

}
