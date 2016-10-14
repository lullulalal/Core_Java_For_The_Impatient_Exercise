package Ch03;

public class Ch03Ex05 {

	public static void main(String[] args) {
		IntSequence test = IntSequenceClass.constant(1);
		int cnt = 0;
		while(test.hasNext()) {
			System.out.println(test.next());
			cnt++;
			if (cnt == 10)
				break;
		}
	}
}
