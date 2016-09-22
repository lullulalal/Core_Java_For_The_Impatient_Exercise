import org.omg.CORBA.IntHolder;
class Ch02Ex04
{
	public static void swap(IntHolder a, IntHolder b)
	{
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}

	public static void main(String[] args) 
	{
		IntHolder myHolder1 = new IntHolder(7);
		IntHolder myHolder2 = new IntHolder(77);

		System.out.println("myHolder1 = " + myHolder1.value);
		System.out.println("myHolder2 = " + myHolder2.value);

		swap(myHolder1, myHolder2);
		System.out.println("---------swap-----------");

		System.out.println("myHolder1 = " + myHolder1.value);
		System.out.println("myHolder2 = " + myHolder2.value);
	}
}
