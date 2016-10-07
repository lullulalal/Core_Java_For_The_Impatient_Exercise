public class Ch03Ex05 {

	public static void main(String[] args) {
		Sequence test = IntSequence.constant(1);
		while(test.hasNext())
			System.out.println(test.nextInt());
	}
}
