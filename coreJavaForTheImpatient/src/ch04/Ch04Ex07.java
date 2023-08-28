package ch04;

public class Ch04Ex07 {

	public static void main(String[] args) {
		for (PrimaryColor pc : PrimaryColor.values())
			System.out.println( pc.toString() + " -> " +
					"R : " + pc.getRed() + 
					", G : " + pc.getGreen() +
					", B : " + pc.getBlue());
	}

}
