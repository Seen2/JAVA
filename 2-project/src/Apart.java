
public class Apart extends Dino{
	private String size="not specified yet";
	
	Apart(){
		super();
	}
	Apart(String n){
		super(n);
	}
	Apart(int a){
		super(a);
	}
	Apart(String n,int a){
		super(n,a);
	}
	Apart(String n,int a,String s){
		super(n,a);
		size=s;
	}
	
	//modifiers
	public void setSize(String s) {
		size=s;
	}
	//accessers
	public String getSize() {
		return size;
	}
	

}
