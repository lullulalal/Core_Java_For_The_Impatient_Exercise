package Ch04Extra;

import Ch04.LabeledPoint;

public class Ch04Ex03 {

	public static void main(String[] args) {
		LabeledPoint lp = new LabeledPoint("label", 1, 1);
		
		//double lpx = lp.x; // error
		//double lpy = lp.y; // error

		double lpx2 = lp.getX();
		double lpy2 = lp.getY();
		
		System.out.println("x : " + lpx2 + ", y : " + lpy2);
	}

}
