import java.util.*;

class Guest<T>{
	private T t;
	public Guest(T t){
		this.t=t;
	}

	public T get(){ return this.t;}
}


public class UserDefinedGenerics{
	public static void main(String []args){

		Guest<Integer> g=new Guest(1);
		System.out.println(g.get());
		Guest<String> guestUser=new Guest("GuestUser");
		System.out.println(guestUser.get());

	}
}
