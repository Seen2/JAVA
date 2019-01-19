public class Pencil {
	
	public int length;
	private String color; //can't be modified from outside of class
	public float diameter;
	private float price;
	
	public static long nextId; //only one copy and can be accessed by class name or object
	// shared by all object of class 
	//static method can only modify the static field or static method of the same class
	
	
	//final method can't be modified in subclass
	
	public void setColor(String myColor) {
		color=myColor;
		
	}
	
	public void setprice(float myPrice) {
		price=myPrice;
		
	}
	//method overloading 
	//(means same class have number of method with the same name unless
	// they have different parameters and jvm figure it out ).
	//APIE==>oop
	
	public float setprice(int n) {
		return price;
		
	}
	
	public String getColor() {
		return color;
		
	}

}
