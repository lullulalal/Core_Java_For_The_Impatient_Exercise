package Ch04;

public abstract class Shape {
	
	Point point;
	
	public Shape() {
		
	}
	
	public void moveBy(double dx, double dy) {
		point.x += dx;
		point.y += dy;
	}
	
	abstract public Point getCenter();
}
