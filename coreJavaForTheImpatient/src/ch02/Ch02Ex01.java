package ch02;

import java.time.*;
import java.util.Scanner;

class Ch02Ex01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("input year : ");
		int year = input.nextInt();
		System.out.print("input month : ");
		int month = input.nextInt();

		//start Mon
		//final String[] DAYOFWEEK = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		//start Sun
		final String[] DAYOFWEEK = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		for ( String str : DAYOFWEEK )
			System.out.print(str + " ");
		System.out.println();

		LocalDate date = LocalDate.of(year, month, 1);
	
		//start Mon
		//for ( int i = 0; i < date.getDayOfWeek().getValue()-1; ++i )
		//start Sun
		for ( int i = 0; i != 7 && i < date.getDayOfWeek().getValue(); ++i )
			System.out.print("    ");

		while (date.getMonthValue() == month) {
			System.out.printf("%3d ", date.getDayOfMonth()); 
			//start Mon
			//if ( date.getDayOfWeek().getValue() == 7)
			//start Sun
			if ( date.getDayOfWeek().getValue() == 6)
				System.out.println();
			date = date.plusDays(1);
		}
		System.out.println();
		input.close();
	}
}
