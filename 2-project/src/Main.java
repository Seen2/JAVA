
public class Main {

	public static void main(String[] args) {
		
		Dino dOne=new Dino();
		//System.out.println(dOne.getName());
		dOne.setName("Genda");
		//System.out.println(dOne.getName());
		
		Tetra tetraOne=new Tetra("Senda");
		System.out.println(tetraOne.getName());
		System.out.println(tetraOne.getLegs());
		tetraOne.setLegs(4);
		System.out.println(tetraOne.getLegs());

	}
}
