abstract class Demo1
{
	abstract void display();
}
public class MyClass extends Demo1
{
	void display()
	{
		System.out.println("Abstract Method");
	}
	public static void main(String []args)
	{
		Demo1 obj = new MyClass();
		obj.display();
	}
}
