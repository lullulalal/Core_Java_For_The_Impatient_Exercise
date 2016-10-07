import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class LengthComparator implements Comparator<String>{
	public int compare(String first, String second){
		return first.length() - second.length();
	}
}

class AlphabetComparator implements Comparator<String>{
	public int compare(String first, String second){
		return first.charAt(0) - second.charAt(0);
	}
}

public class Ch03Ex07 {

	public static void luckySort(ArrayList<String> strings, Comparator<String> comp)
	{

		while(true) {
			Collections.shuffle(strings);
			int cnt = 0;
			for (cnt = 0; cnt < strings.size()-1; cnt++){	
				if ( comp.compare(strings.get(cnt), strings.get(cnt+1)) > 0 )
					break;
			}
			
			if (cnt == strings.size()-1)
				break;
		}
	}
	
	public static void main(String[] args) {

		ArrayList<String> test = new ArrayList<>();
		test.add("Seoul");
		test.add("Hirosima");
		test.add("London");
		test.add("Newyork");
		test.add("Oslo");
		
		//using LengthComparator
		luckySort(test, new LengthComparator());
		System.out.println("**using LengthComparator**");
		for(int i = 0; i < test.size(); i++)
			System.out.print(test.get(i) + ", ");
		
		System.out.println();
		System.out.println();
		
		//using AlphabetComparator
		luckySort(test, new AlphabetComparator());
		System.out.println("**using AlphabetComparator**");
		for(int i = 0; i < test.size(); i++)
			System.out.print(test.get(i) + ", ");
	}
}
