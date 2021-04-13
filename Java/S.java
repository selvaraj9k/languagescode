public class S implements Runnable
{
	public void run()
	{
		System.out.println("New thread running");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args)
	{
		System.out.println("Main thread running");
	        S th = new S();
		Thread t = new Thread(th);
		t.start();
	}
}
