import java.util.ArrayList;
import java.util.Collections;

public class Ch01Ex13
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		for ( int i = 1; i < 50; ++i)
			numbers.add(i);

		ArrayList<Integer> chosen  = new ArrayList<>();
		
		for (int i = 0; i < 6; ++i) {
			int ran = (int)(Math.random() * numbers.size()) ;
			chosen.add(numbers.get(ran));

			numbers.remove(ran);
		}
		Collections.sort(chosen);
		System.out.println( chosen.toString() );
	}
}
