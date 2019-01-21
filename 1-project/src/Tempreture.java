
public class Tempreture {
	
	private float value;
	private char scale;
	
	//constructor name should match the class name
	//default or no-arg constructor 
	Tempreture(){
		value=0;
		scale='C';
		
	}
	//constructor is a function so it can be overloaded
	Tempreture(float newValue){
		this();
		value=newValue;
	}
	
	Tempreture(char newScale){
		this();
		scale=newScale;
		
	}

	Tempreture(float newValue, char newScale){
		scale=newScale;
		value=newValue;
	}
	
	
	public float  tempratureC(float f){
		if(this.scale=='F') {
			float newValue=5*(f-32)/9;
			
			return (newValue);
		}
		else {
			return (f);
		}
		
	}
	public float tempratureF(float c){
		
		if(this.scale=='C') {
			float newValue=9*(c)/5+32;
			
			return (newValue);
		}
		else {
			return (c);
		}
			
	}
	
	public void setValue(float newValue) {
		this.value=newValue;
		
	}
	public void setScale(char newScale) {
		this.scale=newScale;
		
	}
	public void setTempreture(float newValue,char newScale) {
		this.value=newValue;
		this.scale=newScale;
		
	}
	public int compareTempreture(Tempreture t) {
		
		if((this.scale=='F' && t.scale=='F')|| (this.scale=='C' && t.scale=='C')) {
			
			if(this.value==t.value) {
				return 0;
			}
			else if(this.value>t.value) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			
			if(this.scale!=t.scale) {
				float value1=tempratureC(this.value);
				float value2=tempratureC(t.value);
				if(value1==value2) {
					return 0;
				}
				else if(value1>value2) {
					return 1;
				}
				else {
					return -1;
				}
			}
		}
		return -1;
		
	}
	public String getTempreture() {
		return Float.toString(this.value)+this.scale	;
	}

}
