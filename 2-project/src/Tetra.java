
public class Tetra extends Dino{
	
	private int legs=0;
	protected int teeths=0;

	Tetra(){
		super();
		
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
	//for overriding purpose, access modifier is protected.
	protected void setTeeths(int t) {
		teeths=t;	
	}
	//accesers 
	public int getLegs() {
		return legs;
		
	}
	public int getTeeths() {
		return teeths;
	}
}
