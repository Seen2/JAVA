interface functionalInterface{

	void display(String str);
}

public class anonymousClass{

	public static void main(String []args){
		functionalInterface f=new functionalInterface(){

			public void display(String s){
				System.out.println(s);
			}

		};
		f.display("Hello");
	}
}
