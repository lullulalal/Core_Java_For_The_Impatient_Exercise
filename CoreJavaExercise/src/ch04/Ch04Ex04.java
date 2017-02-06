package ch04;

public class Ch04Ex04 {

	public static void main(String[] args) {
		Line lt = new Line(new Point(1,4), new Point(-4, -1));
		System.out.println("new Line - center : " + lt.getCenter());
		lt.moveBy(1,  1);
		System.out.println("moved Line - center : " + lt.getCenter());
		
		System.out.println();
		Rectangle rt = new Rectangle(new Point(3,4), 10, 11);
		System.out.println("new Rectangle - center : " + rt.getCenter());
		rt.moveBy(2,  3);
		System.out.println("moved Rectangle - center : " + rt.getCenter());
		
		System.out.println();
		Circle ct = new Circle(new Point(1, 2), 3.3);
		System.out.println("new Circle - center : " + ct.getCenter());
		ct.moveBy(1,  2);
		System.out.println("moved Circle - center : " + ct.getCenter());
	}

}
