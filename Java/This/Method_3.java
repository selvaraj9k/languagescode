class A
{
	A()
	{
		System.out.println("Hello selva");
	}
	A(int x)
	{
		this();
		System.out.println(x);
	}
}
class Method_3
{
	public static void main(String[] args)
		{
			A a =  new A(10);
		}
}
