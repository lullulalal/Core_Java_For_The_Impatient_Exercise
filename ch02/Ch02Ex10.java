package Ch02;

import java.util.Random;
import java.util.ArrayList;

class RandomNumbers 
{
	static int randomElement( int[] arr )
	{
		if ( arr == null ) return 0;
		Random generator = new Random();
		int index = generator.nextInt( arr.length );
		return arr[index];
	}

	static int randomElement( ArrayList<Integer> arrList )
	{
		if ( arrList == null ) return 0;
		Random generator = new Random();
		int index = generator.nextInt( arrList.size() );
		
		return arrList.get(index);
	}
}

public class Ch02Ex10 
{
	public static void main(String[] args) 
	{
		int[] intArray = new int[500];
		for (int i = 0; i < intArray.length; ++i)
			intArray[i] = i;

		System.out.printf("Random access int[] : %d%n", RandomNumbers.randomElement(intArray)); 

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for (int i = 0; i < 500; ++i) 
			intArrayList.add(0, i);

		System.out.printf("Random access ArrayList<Integer> : %d%n", RandomNumbers.randomElement(intArrayList)); 
	}
}
