package ch01;
import java.util.Scanner;

public class Ch01Ex10
{
	static char mapping(long num)
	{
		char A = '\u0041';

		for ( long i = 10;  i < 36; ++i )
		{
			if ( num == i )
				break;
			A++;
		}
		return A; 
	}

	public static void main(String[] args) 
	{
		System.out.print("Input : ");
		Scanner input = new Scanner(System.in);
		long in = input.nextLong();
		long remainder = 0;
		long quotient = 1;
		String result = "";

		while (quotient != 0) {
			quotient = in / 36;
			remainder = in % 36;

			if ( remainder >= 10 )
				result += mapping(remainder);
			else
				result += remainder;	
			in = quotient;
		}

		System.out.println("result : " + result);

	}
}
