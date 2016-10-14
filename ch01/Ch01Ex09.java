package Ch01;

public class Ch01Ex09 
{
	public static void main(String[] args) 
	{
		String a = new String("abc");
		String b = new String("abc");

		if(a.equals(b))
			System.out.println("hi");

		if(a==b)
			System.out.println("hello");
	}
}
