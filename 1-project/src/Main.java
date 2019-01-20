
public class Main {
	public static void main( String []args) {
		
		float val=12.09f;
		
		Temprature one=new Temprature();
		Temprature two=new Temprature(val);
		Temprature three=new Temprature('C');
		Temprature four=new Temprature(val,'C');
		
		System.out.println(one.getValue());
		one.tempratureC(-40);
		System.out.println(one.getValue());
	}

}
