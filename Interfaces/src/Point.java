
public class Point implements Shape {
	
	protected int x,y;
	
	//no argument constructor
	Point(){
		setPoint(0,0);
	}
	
	Point(int xCordinate, int yCordinate){
		setPoint(xCordinate, yCordinate);
	}
	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Point";
	}
	
	public void setPoint(int xCordinate, int yCordinate) {
		x=xCordinate;
		y=yCordinate;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "["+x+","+y+"]";
	}
}
