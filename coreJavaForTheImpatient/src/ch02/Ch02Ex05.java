package ch02;

import java.text.DecimalFormat;

class Point05
{
	private double x;
	private double y;

	public Point05( double inX, double inY )
	{
		x = inX;
		y = inY;
	}

	public Point05()
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

	public Point05 translate( double moveX, double moveY)
	{

		double newX = x + (double)moveX;
		double newY = y + (double)moveY;
		return new Point05(newX, newY);
	}

	public Point05 scale( double ratio )
	{
		double newX = x * (double)ratio;
		double newY = y * (double)ratio;
		return new Point05(newX, newY);
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
		Point05 tP = new Point05(3, 4).translate(1, 3).scale(0.5);
		System.out.printf("result : (%s, %s)%n", formatD(tP.getX()), formatD(tP.getY()));
	}
}
