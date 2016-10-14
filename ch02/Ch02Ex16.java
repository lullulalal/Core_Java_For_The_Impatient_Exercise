package Ch02;

import java.util.ArrayList;

class QueueStr16
{
	private static class Node {
		private String str;
		public Node(String inStr)
		{
			str = inStr;
		}
		public String toString()
		{
			return str;
		}
	}

	private ArrayList<Node> strList = new ArrayList<>();


	void add(String input)
	{
		Node newNode = new Node(input);
		strList.add(newNode);
	}
	
	void remove()
	{
		strList.remove( 0 ) ;
	}

	void printAll()
	{
		for (Node n : strList)
		{
			System.out.print(n);
		}
	}
}

public class Ch02Ex16
{
	public static void main(String[] args) 
	{
		QueueStr16 testQ = new QueueStr16();
		testQ.add("a");
		testQ.add("bcd");
		testQ.add("efgh");

		testQ.printAll();
		System.out.println();
		
		testQ.remove();
		testQ.printAll();
		System.out.println();
	}
}
