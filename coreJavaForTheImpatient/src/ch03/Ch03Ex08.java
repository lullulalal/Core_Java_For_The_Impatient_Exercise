package ch03;

class Greeter implements Runnable {
	int n;
	String target;
	
	public Greeter( int n, String target )
	{
		this.n = n;
		this.target = target;
	}
	
	public void run()
	{
		for (int i = 0; i < n; ++i)
			System.out.println("Hello, " + target);
	}
}

public class Ch03Ex08 {

	public static void main(String[] args) {
		
		Runnable task1 = new Greeter(1000, "Mother");
		Runnable task2 = new Greeter(1231, "Father");
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
	}

}