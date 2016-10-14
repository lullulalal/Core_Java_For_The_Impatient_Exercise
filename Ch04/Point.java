package Ch04;

import java.util.Objects;

public class Point implements Cloneable{
	protected double x;
	protected double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String toString() {
		return "x : " + x + ", " + "y : " + y;
	}
	
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;

		Point otherPoint = (Point)obj;
		boolean result = false;
	
		if ( x == otherPoint.x && y == otherPoint.y )
			result = true;
		
		return result;
	}
	
	public int	hashCode() {
		return Objects.hash(x, y);
	}
	
	public Point clone() throws CloneNotSupportedException{
		return (Point) super.clone();
	}
	
	
}
