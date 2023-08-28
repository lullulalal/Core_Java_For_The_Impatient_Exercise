package ch04;
public class Circle extends Shape {

	double radius;
	
	public Circle(Point center, double radius){
		this.point = center;
		this.radius = radius;
	}
	
	@Override
	public Point getCenter() {
		return point;
	}
	
	public Circle clone() throws CloneNotSupportedException{
		Circle c = new Circle( (Point)point.clone(), radius );
		return c;
	}
}
