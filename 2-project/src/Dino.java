
public class Dino {
	private String name;
	private int age;
	
	Dino(){
		name="No name yet..";
		age=21;
	}
	
	Dino(String dname){
		this();
		name=dname;
	}
	Dino(int dage){
		this();
		age=dage;
	}
	Dino(String dname, int dage){
		this();
		name=dname;
		age=dage;
	}
	
	public void setName(String newName) {
		this.name=newName;
	}
	public void setAge(int newAge) {
		age=newAge;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
