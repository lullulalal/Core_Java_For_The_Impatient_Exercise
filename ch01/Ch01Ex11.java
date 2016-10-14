package Ch01;

import java.util.Scanner;

public class Ch01Ex11  
{
	public static void main(String[] args) 
	{
		System.out.print("Input (string) : ");
		Scanner input = new Scanner(System.in); 
		String str = input.nextLine();
		
		int[] codePoints = str.codePoints().toArray();
		int length = str.codePointCount(0, str.length());

		for(int i = 0; i < length; ++i)
		{
			System.out.print(Character.toChars(codePoints[i]));
			System.out.print(" ");
		//	if ( codePoints[i] > 127 )
				System.out.printf("%#X\n", codePoints[i]);	
		//	else
		//		System.out.println();
		}
	}
}
