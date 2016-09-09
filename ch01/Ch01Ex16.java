public class Ch01Ex16 
{
	public static double average( double first, double... values )
	{
		double sum = first;
		for (double v : values)
			sum += v;

		int num = 0;
		
		if( values.length == 0 ) 
			num = 1;
		else
			num = values.length + 1;

		return sum / num;
	}
	public static void main(String[] args) 
	{
		System.out.println(average(1, 0, 3));
	}
}
