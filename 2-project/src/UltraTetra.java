
public class UltraTetra extends Tetra{
	
	private boolean ultraSpecies;

	UltraTetra(){
		super();
	}
	UltraTetra(String n,int a){
		super(n,a);
	}
	UltraTetra(String n){
		super(n);
	}
	UltraTetra(int a){
		super(a);
	}
	UltraTetra(String n,int a, int l){
		super(n,a,l);
	}
	UltraTetra(String n,int a, boolean u){
		super(n,a);
		ultraSpecies=u;
	}
	UltraTetra(String n,int a, int l, boolean u){
		super(n,a,l);
		ultraSpecies=u;
	}
	//modifiers
	public void setUltraSpecies(boolean b) {
		ultraSpecies=b;
	}
	//accesers
	public boolean getUltraSpecies() {
		return ultraSpecies;
	}
	//overriding
	//i)parameter of super and sub are same.
	//ii) return type is same.
	//iii) wider access modifiers.
	public void setTeeths(int t) {
		teeths=t;	
	}

}
