interface functionalRef{
	void display(String str);
}

class functionalReferences{
	public functionalReferences(String v){
		System.out.println(v);
	}

	public void showMessage(String str){
		System.out.println(str);
	}
	public static void show(String msg){
		System.out.println(msg);
	}
}

public class methodRefrences{

	public static void main(String []args){

		//static method refrencing
		functionalRef f=functionalReferences::show;
		f.display("Static method refrencing");

		//constructor refrencing
		functionalRef c=functionalReferences::new;
		c.display("Constructor method refrencing");

		//instance method refrencing
		functionalReferences newFunc=new functionalReferences("");
		functionalRef newRef=newFunc::showMessage;
		newRef.display("Instance method refrencing");


	}
}
