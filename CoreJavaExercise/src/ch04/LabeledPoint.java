package ch04;

import java.util.Objects;

public class LabeledPoint extends Point {
	String label;
	
	public LabeledPoint(String label, double x, double y)
	{
		super(x, y);
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		if ( this == obj ) return true;
		if (getClass() != obj.getClass()) return false;
			
		LabeledPoint otherLPoint = (LabeledPoint)obj;

		return otherLPoint.label.equals(label);
	}
	
	public int	hashCode() {
		return Objects.hash(label, x, y);
	}
	
	public String toString() {
		return label + ", " + super.toString();
	}
}
