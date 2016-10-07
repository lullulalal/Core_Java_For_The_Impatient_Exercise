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
		
		// TODO Auto-generated method stub

	}

}

//Runnable을 구현하는 Greeter 클래스를 구현하라 이 클래스의 run 메서드는 "hello, " + target을 n번 출력해야한다.
//여기서 n과 target은 생성자에서 설정한다. 각기 다른 메시지로 인스턴스 두개를 생성해서 두 세레드에서 동시에 실행 하라.