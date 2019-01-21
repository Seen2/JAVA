
public class Main {
	public static void main( String []args) {
		
		float val=10.09f;
		
		Tempreture one=new Tempreture();
		//Tempreture two=new Tempreture(val);
		//Tempreture three=new Tempreture('C');
		//Tempreture four=new Tempreture(val,'C');
		Tempreture n=new Tempreture(val,'F');
		//System.out.println(one.getTempreture());
		//System.out.println(n.getTempreture());
		
		
		//System.out.println(n.getTempreture());
		System.out.println(n.tempratureC(-40));
		/*
		//using static function via class name
		System.out.println(Tempreture.compareTempretures(one,n));
		*/
		//System.out.println(n.getTempreture());
	}

}
