public class MyThread implements Runnable
{
int a = 100, b = 50 ;
public void run()
{
addition();
subtraction();
multiplication();
}
void addition()
{
int sum = a + b;
System.out.println("Addition of two numbers:" +sum);
}
void subtraction()
{
int sub = a - b;
System.out.println("Subtraction of two numbers: " +sub);
}
void multiplication()
{
int multiply = a * b;
System.out.println("Multiplication of two numbers: "+multiply);
}
public static void main(String[] args)
{
System.out.println("Main thread running");
MyThread th = new MyThread();
Thread t = new Thread(th);
t.start();
}
}




