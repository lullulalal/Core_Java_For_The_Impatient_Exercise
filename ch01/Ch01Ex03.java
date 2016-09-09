import java.util.Scanner;
import java.util.ArrayList;
public class Ch01Ex03
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers = new ArrayList<>();

		Scanner input  = new Scanner(System.in);
		
		
		for (int i = 0; i < 3; ++i)
		{
			System.out.printf("Input %d ют╥б : ", i+1);
			numbers.add(input.nextInt());
		}
		
		int temp = 0;
		int result = 0;
		
		temp = numbers.get(0) > numbers.get(1) ? numbers.get(0) : numbers.get(1);
		result = numbers.get(2) > temp ? numbers.get(2) : temp;
		
		//temp = Math.max(numbers.get(0), numbers.get(1));
		//result = Math.max(numbers.get(2), temp);
		
		System.out.print("Result : ");
		System.out.println(result);
	}
}
