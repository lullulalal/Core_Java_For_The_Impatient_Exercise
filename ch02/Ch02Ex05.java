import java.text.DecimalFormat;

class Point
{
	private double x;
	private double y;

	public Point( double inX, double inY )
	{
		x = inX;
		y = inY;
	}

	public Point()
	{
		this(0.0, 0.0);
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public Point translate( double moveX, double moveY)
	{

		double newX = x + (double)moveX;
		double newY = y + (double)moveY;
		return new Point(newX, newY);
	}

	public Point scale( double ratio )
	{
		double newX = x * (double)ratio;
		double newY = y * (double)ratio;
		return new Point(newX, newY);
	}
}

public class Ch02Ex05 
{
	static DecimalFormat df = new DecimalFormat("#.#######");

	public static String formatD(double number) {
		return df.format(number);
	}

	public static void main(String[] args) 
	{
		Point tP = new Point(3, 4).translate(1, 3).scale(0.5);
		System.out.printf("result : (%s, %s)%n", formatD(tP.getX()), formatD(tP.getY()));
	}
}
