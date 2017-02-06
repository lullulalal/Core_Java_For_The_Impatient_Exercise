package ch04;

import java.util.HashSet;
import java.util.Set;

public class Ch04Ex02 {

	public static void main(String[] args) {
		
		//test
		
		Point p1 = new Point(1, 2);
		LabeledPoint p2 = new LabeledPoint("label1", 1, 2);
		Point p3 = new Point(1, 2);
		Point p4 = new LabeledPoint("label1", 1, 2);
		LabeledPoint p6 = new LabeledPoint("label1", 1, 2);

	
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.equals(p2)); // false
		System.out.println(p2.equals(p1)); // false
		
		System.out.println(p2.equals(p4)); // true
		System.out.println(p4.equals(p2)); // true
		
		System.out.println(p2.equals(p6)); // true
		System.out.println(p6.equals(p2)); // true

		System.out.println(p1.equals(p3)); // true
		System.out.println(p3.equals(p1)); // true
		
		Set<Point> a = new HashSet<>();
		a.add(p1);
		a.add(p2);
		a.add(p6);
		a.add(p2);
		
		for (Point point : a) {
			System.out.println(point);
		}
		
	}

}
