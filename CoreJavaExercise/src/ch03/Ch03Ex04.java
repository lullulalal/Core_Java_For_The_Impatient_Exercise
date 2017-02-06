package ch03;
public class Ch03Ex04 {

	public static void main(String[] args) {
		IntSequence test = IntSequenceClass.of(1, 2, 3, 4, 5, 6);
		while (test.hasNext())
		{
			System.out.println(test.next());
		}
	}
}
