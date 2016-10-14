package Ch03;

public class Ch03Ex13 {

	public static Runnable run ( Runnable[] runs)
	{
		return () -> {
			for ( Runnable r : runs ) {
				Thread thread = new Thread(r);
				thread.run();
			}
		};
	}
	
	public static void main(String[] args) {
		Runnable[] testRuns = new Runnable[10];
		
		for( int i = 0; i < testRuns.length; ++i )
			testRuns[i] = () -> System.out.println("Thread Start!");
		
		Runnable tRun = run(testRuns);
		Thread thread = new Thread(tRun);
		thread.start();
	}
}
