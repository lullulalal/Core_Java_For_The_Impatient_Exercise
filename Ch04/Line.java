package Ch04;

public class Line extends Shape{

	Point relativePosOfTo;
	
	public Line(Point from, Point to) {
		this.point = from;
		double x = to.getX() - from.getX();
		double y = to.getY() - from.getY();
		relativePosOfTo = new Point(x, y);
	}
	
	@Override
	public Point getCenter() {
		double x = ( point.getX() + ( point.getX() + relativePosOfTo.getX() ) ) / 2;
		double y = ( point.getY() + ( point.getY() + relativePosOfTo.getY() ) ) / 2;
		
		return new Point(x, y);
	}
	
	public Line clone() throws CloneNotSupportedException{
		Line l = new Line((Point)point.clone(), new Point(point.getX() + relativePosOfTo.getX(),
														point.getY() + relativePosOfTo.getY()));
	
		return l;
	}
}
