package Ch04;

public class Ch04Ex05 {

	public static void main(String[] args) {
		// Line Clone Test
		Line lt = new Line(new Point(1,4), new Point(-4, -1));
		System.out.println("new L1 - center : " + lt.getCenter());
		lt.moveBy(1,  1);
		System.out.println("moved L1 - center : " + lt.getCenter());
		
		try {
			Line lt2 = lt.clone();
			System.out.println("Clone L2 - center : " + lt2.getCenter());
			lt2.moveBy(3, 7);
			System.out.println("Moved L2 - center : " + lt2.getCenter());
			System.out.println("L1 - Center : " + lt.getCenter());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		// Rectangle Clone Test
		Rectangle rt = new Rectangle(new Point(3,4), 10, 11);
		System.out.println("new R1 - center : " + rt.getCenter());
		rt.moveBy(2,  3);
		System.out.println("moved R1 - center : " + rt.getCenter());
		
		try {
			Rectangle rt2 = rt.clone();
			System.out.println("Clone R2 - center : " + rt2.getCenter());
			rt2.moveBy(10, 10);
			System.out.println("Moved R2 - center : " + rt2.getCenter());
			System.out.println("R1 - Center : " + rt.getCenter());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		// Circle Clone Test
		Circle ct = new Circle(new Point(1, 2), 3.3);
		System.out.println("new C1 - center : " + ct.getCenter());
		ct.moveBy(1,  2);
		System.out.println("moved C1 - center : " + ct.getCenter());
		
		try {
			Circle ct2 = ct.clone();
			System.out.println("Clone C2 - center : " + ct2.getCenter());
			ct2.moveBy(2, 4);
			System.out.println("Moved C2 - center : " + ct2.getCenter());
			System.out.println("C1 - Center : " + ct.getCenter());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
