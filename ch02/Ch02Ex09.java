package Ch02;

class Car
{
	static final int MAX_GASTANK_VOLUME = 100;

	private double gasTank;
	private double distanceDriven;
	private double currentLocation;
	private double efficiency;

	public Car ( double milesPerGal )
	{
		efficiency = (double)milesPerGal;
	}

	public void drive(double miles, boolean isPositiveDirection)
	{
		if (gasTank == 0.0) {
			System.out.println("Gas Tank is empty");
			return;
		}
		double consumeGas = miles * ( 1 / (double)efficiency );

		if ( consumeGas > gasTank ) {
			double preGasTank =  gasTank;
			gasTank -= gasTank;

			distanceDriven += efficiency * (double)preGasTank;
			if ( isPositiveDirection == true ) {
				currentLocation += efficiency * (double)preGasTank;
				System.out.printf( "moves = %.3f,  GasTank = %.3f%n", efficiency*(double)preGasTank, gasTank);
			}
			else {
				currentLocation -= efficiency * (double)preGasTank;
				System.out.printf( "moves = -%.3f,  GasTank = %.3f%n", efficiency*(double)preGasTank, gasTank);
			}
		}
		else {
			distanceDriven += miles;
			if ( isPositiveDirection == true ) {
				currentLocation += miles;
				System.out.printf( "moves = %.3f,  GasTank = %.3f%n", miles, gasTank);
			}
			else {
				currentLocation -= miles;
				System.out.printf( "moves = %.3f,  GasTank = %.3f%n", miles, gasTank);
			}
		
			gasTank -= consumeGas;
		}
	}

	public void fillGas(double gallons)
	{
		if ( gasTank + gallons > MAX_GASTANK_VOLUME )
			gasTank = MAX_GASTANK_VOLUME;
		else
			gasTank+= gallons;
		System.out.printf("GasTank = %.3f%n", gasTank);
	}

	public double getCurrentLocation()
	{
		return currentLocation;
	}
}

public class Ch02Ex09 
{
	public static void main(String[] args) 
	{
		Car myCar = new Car(1.2);
		myCar.drive(10.55, true);

		myCar.fillGas(50.563);
		myCar.drive(10.66, true);
		myCar.drive(75.23, false);

		System.out.printf("getCurrentLocation : %.3f%n", myCar.getCurrentLocation());	
	}
}