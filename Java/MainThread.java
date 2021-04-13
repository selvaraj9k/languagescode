public class MainThread
{
	public static void main(String args[])
	{
		Thread obj = Thread.currentThread();
		System.out.println("Current thread is "+obj);
		System.out.println("Nmae of the Thread is "+obj.getName());
	}
}
