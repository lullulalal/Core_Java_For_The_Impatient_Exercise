package ch01;

import java.util.Scanner;
import java.util.ArrayList;

public class Ch01Ex15
{
	public static void main(String[] args) 
	{
		System.out.print("Input (layer) : ");
		Scanner input = new Scanner(System.in);
		int layer = input.nextInt();
		
		ArrayList<ArrayList<Integer>> pascal = new ArrayList<>();
		

		for (int i = 0; i <= layer; ++i)
		{
			ArrayList<Integer> layerNum = new ArrayList<>();
			for (int j = 0; j <= i; ++j)
			{
				if ( j == 0 || j == i )
					layerNum.add(j, 1);
				else
					layerNum.add( pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j) );
			}
			pascal.add(layerNum);

		}

		for ( ArrayList<Integer> layerNum : pascal ){
			for ( Integer num : layerNum )
				System.out.print(num + " ");
			System.out.println();
		}
	}
}
