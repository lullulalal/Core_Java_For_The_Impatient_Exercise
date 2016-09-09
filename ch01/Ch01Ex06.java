import java.util.Scanner;
import java.math.BigInteger;

public class Ch01Ex06  
{
	public static void main(String[] args) 
	{	
		System.out.print("Input : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		BigInteger result = BigInteger.valueOf(1);
		for ( int i = 1; i < n + 1; ++i )
			result = result.multiply( BigInteger.valueOf(i) );

		System.out.println(result.toString());
	}
}
