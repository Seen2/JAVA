public class Inheritence{
	public static void main(String []args){
		new C();
	}
}

class A{
	A(){
		System.out.println("From A");
	}

}

class B extends A{
	B(){
		super();
		System.out.println("From B");
	}
}

class C extends B{
	C(){
		super();
		System.out.println("From C");
	}
}
