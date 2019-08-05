
public class Circle extends Point {

	protected double radius;
	
	public Circle() {
		setRadius(0);
	}
	
	public Circle(int xCordinate,int yCordinate,double r) {
		super(xCordinate,yCordinate);
		setRadius(r);	
	}
	
	public void setRadius(double r) {
		radius=r;
	}
	public double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		
		
		return Math.PI*radius*radius;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Circle";
	}
	
}
