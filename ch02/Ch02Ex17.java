package Ch02;

import java.util.ArrayList;

class QueueStr17
{
	private static class Node 
	{
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

	public class Iterator 
	{
		private int index ;
		
		public Object next()
		{
			Node n = strList.get(index);
			index++;
			return n;
		}

		public boolean hasNext()
		{
			boolean result = false;
			if ( index < strList.size() )
				result = true;
			return result;
		}
	}

	private ArrayList<Node> strList = new ArrayList<>();

	public Iterator iterator()
	{
		return new Iterator();
	}

	public void add(String input)
	{
		Node newNode = new Node(input);
		strList.add(newNode);
	}
	
	public void remove()
	{
		strList.remove( 0 ) ;
	}
}

public class Ch02Ex17
{
	public static void main(String[] args) 
	{
		QueueStr17 testQ = new QueueStr17();

		testQ.add("a");
		testQ.add("bcd");
		testQ.add("efgh");

		testQ.remove();
		testQ.remove();
		QueueStr17.Iterator iter = testQ.iterator(); 
		while( iter.hasNext() )
			System.out.print(iter.next());
		System.out.println();
	}
}
