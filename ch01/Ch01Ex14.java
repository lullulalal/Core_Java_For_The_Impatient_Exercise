import java.util.Scanner;
import java.util.ArrayList;

public class Ch01Ex14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> square = new ArrayList<>();
		
		int sum = 0;
		while(true) {
			String inStr = input.nextLine();
			if(inStr.length() == 0)
				break;
			String[] splitedInStr = inStr.split("\\s+");
			ArrayList<Integer> line = new ArrayList<>();
			for (int i = 0; i < splitedInStr.length; ++i) {
				if( i == 0)
					sum += Integer.parseInt(splitedInStr[i]);
				line.add( Integer.parseInt(splitedInStr[i]) );
			}
			square.add(line);
		}

		boolean result = false;

		int[] vertical = new int[square.size()];
		int[] diagonal = {0, 0};

		for( int i = 0; i < square.size(); ++i )
		{
			int horizon = 0;
			for( int j = 0; j < square.get(i).size(); ++j )
			{
				vertical[j] += square.get(i).get(j);

				horizon += square.get(i).get(j);

				if ( i == j )
					diagonal[0] += square.get(i).get(j);
				if ( j == square.size() - (i + 1) )
					diagonal[1] += square.get(i).get(j);

			}

			if ( sum != horizon ) {
				System.out.println("It is not Magic square");
				return;
			}
			
		}	
		for ( int n : vertical ) {
			if ( sum != n ) {
				System.out.println("It is not Magic square");
				return;
			}
		}
		for ( int n : diagonal ) {
			if ( sum != n ) {
				System.out.println("It is not Magic square");
				return;
			}
		}
		System.out.println("** It is Magic square **");
	}
}
