
public class Tetra extends Dino{
	
	private int legs;

	Tetra(){
		super();
		legs=0;
	}
	
	Tetra(String n){
		super(n);
		
	}
	Tetra(String n,int a){
		super(n,a);
		
	}
	Tetra(int a){
		super(a);
	}
	Tetra(String n,int a,int newLegs){
		super(n,a);
		legs=newLegs;
	}
	//modifiers
	public void setLegs(int newLegs) {
		legs=newLegs;
		
	}
	//accesers 
	public int getLegs() {
		return legs;
		
	}
}
