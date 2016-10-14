package Ch03;

public class Ch03Ex09 {

	public static void runTogether(Runnable... tasks) {
		for(Runnable r : tasks)	{
			Thread th = new Thread(r);
			th.start();
		}
	}
	public static void runInOrder(Runnable... tasks) throws InterruptedException {
		for(Runnable r : tasks)	{
			Thread th = new Thread(r);
			th.start();
			th.join();
		}
	}
	public static void main(String[] args) throws InterruptedException {

		Runnable task1 = new Greeter(100, "Mother");
		Runnable task2 = new Greeter(120, "Father");
		Runnable task3 = new Greeter(40, "Teacher");
		Runnable task4 = new Greeter(155, "Dalling");
		Runnable task5 = new Greeter(122, "there");
		
		runTogether(task1, task2, task3, task4, task5);
		
		try{
			runInOrder(task1, task2, task3, task4, task5);
		}
		catch( InterruptedException ie )
		{
			System.out.println(ie.toString());
		}
	}

}
