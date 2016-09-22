import java.util.ArrayList;

class QueueStr
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
		
		public Node next()
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

	public void printAll()
	{
		for (Node n : strList)
		{
			System.out.print(n);
		}
	}
}

public class Ch02Ex17
{
	public static void main(String[] args) 
	{
		QueueStr testQ = new QueueStr();
		testQ.add("a");
		testQ.add("bcd");
		testQ.add("efgh");

		testQ.printAll();
		System.out.println();
		
		testQ.remove();
		testQ.printAll();
		System.out.println();

		QueueStr.Iterator iter = testQ.iterator(); 
		while( iter.hasNext() )
			System.out.print(iter.next());
	}
}
