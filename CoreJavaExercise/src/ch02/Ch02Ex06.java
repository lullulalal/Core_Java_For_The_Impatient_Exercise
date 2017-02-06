package ch02;
import java.text.DecimalFormat;

class Point06
{
	private double x;
	private double y;

	public Point06( double inX, double inY )
	{
		x = inX;
		y = inY;
	}

	public Point06()
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

	public Point06 translate( double moveX, double moveY)
	{
		x += (double)moveX;
		y += (double)moveY;
		return this;
	}

	public Point06 scale( double ratio )
	{
		x *= (double)ratio;
		y *= (double)ratio;
		return this;
	}

}

public class Ch02Ex06 
{
	static DecimalFormat df = new DecimalFormat("#.#######");

	public static String formatD(double number) {
		return df.format(number);
	}

	public static void main(String[] args) 
	{
		Point06 tP = new Point06(3, 4).translate(1, 3).scale(0.5);
		System.out.printf("result : (%s, %s)%n", formatD(tP.getX()), formatD(tP.getY()));
	}
}
