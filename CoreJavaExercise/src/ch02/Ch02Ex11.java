package ch02;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.out;
import static java.time.LocalDate.of;

class Ch02Ex11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		out.print("input year : ");
		int year = input.nextInt();
		out.print("input month : ");
		int month = input.nextInt();

		//start Mon
		final String[] DAYOFWEEK = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		//start Sun
		//final String[] DAYOFWEEK = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

		for ( String str : DAYOFWEEK )
			out.print(str + " ");
		out.println();

		LocalDate date = of(year, month, 1);
	
		//start Mon
		for ( int i = 0; i < date.getDayOfWeek().getValue()-1; ++i )
		//start Sun
		//for ( int i = 0; i != 7 && i < date.getDayOfWeek().getValue(); ++i )
			out.print("    ");

		while (date.getMonthValue() == month) {
			out.printf("%3d ", date.getDayOfMonth()); 
			//start Mon
			if ( date.getDayOfWeek().getValue() == 7)
			//start Sun
			//if ( date.getDayOfWeek().getValue() == 6)
				out.println();
			date = date.plusDays(1);
		}
		out.println();
	}
}
