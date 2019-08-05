
public class Cylinder extends Circle {

	protected double height;
	
	public Cylinder() {
		super.setRadius(0);
		super.setPoint(0, 0);
		setHeight(0);
	}
	
	public Cylinder(int xCordinate,int yCordinate,double r,double h) {
		super.setRadius(r);
		super.setPoint(xCordinate,yCordinate);
		setHeight(h);
	}
	
	public void setHeight(double h) {
		height=h;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	@Override
	public double area() {
		
		
		return Math.PI*radius*radius+2*Math.PI*radius*height;
	}

	@Override
	public double volume() {
		
		return Math.PI*radius*radius*height;
	}

	@Override
	public String getName() {
		
		return "Cylinder";
	}
	

}
