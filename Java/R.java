public class R extends Thread
{
public void run()
{
System.out.println("New thread running ");
}
public static void main(String[] args)
{
System.out.println("Main thread running");
R th = new R();
Thread t = new Thread(th);
t.start();
}
}
