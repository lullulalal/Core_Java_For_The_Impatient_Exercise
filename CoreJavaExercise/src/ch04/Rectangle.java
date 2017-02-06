package ch04;

public class Rectangle extends Shape{
	
	double width;
	double height;
	
	public Rectangle(Point topLeft, double width, double height) {
		this.point = topLeft;
		this.width = width;
		this.height = height;
	}

	@Override
	public Point getCenter() {
		double x = point.x + width/2 ;
		double y = point.y + height/2;
		
		return new Point(x, y);
	}
	

	public Rectangle clone() throws CloneNotSupportedException{
		Rectangle r = new Rectangle((Point)point.clone(),
								width, height);
		
		return r;
	}
}
