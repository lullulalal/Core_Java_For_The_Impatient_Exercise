package ch01;

import java.util.Scanner;

public class Ch01Ex01  
{
	public static void main(String[] args) 
	{
		System.out.print("Input(integer) : "); 
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		
		String inBinary = Integer.toBinaryString(in);

		System.out.printf("decimal : %d\nhexa : %#X\noctal : %#o\n", in, in, in); 
		System.out.println("binary : " + inBinary);

		double reciprocal = Math.pow(in, -1);		
		System.out.printf("inverse hexa : " + Double.toHexString(reciprocal));
		
		input.close();
	}
}
