package Ch01;

import java.util.Scanner;

public class Ch01Ex02
{
	public static void main(String[] args) 
	{
		System.out.print("Input : ");
		Scanner input = new Scanner(System.in);
		int angle = input.nextInt();

		System.out.println("Result : ");
		int normal = ( (angle % 360) + 360 ) % 360;
		int normal2 = Math.floorMod(angle, 360);

		System.out.println(normal);
		System.out.println(normal2);
		input.close();
	}
}
