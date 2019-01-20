
public class Temprature {
	
	private float value;
	private char scale;
	
	//constructor name should match the class name
	//default or no-arg constructor 
	Temprature(){
		value=0;
		scale='C';
		
	}
	//constructor is a function so it can be overloaded
	Temprature(float newValue){
		this();
		value=newValue;
	}
	
	Temprature(char newScale){
		this();
		scale=newScale;
		
	}

	Temprature(float newValue, char newScale){
		scale=newScale;
		value=newValue;
	}
	
	public void tempratureC(float f){
		value=5*(f-32)/32;
		scale='C';
		
	}
	public void tempratureF(float c){
		
		value=9*(c)/5+32;
		scale='F';	
	}
	
	public void setValue(float newValue) {
		value=newValue;
		
	}
	public float getValue() {
		return value;
	}

}
