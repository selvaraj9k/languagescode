class A
{
	A getA()
	{
		return this;
	}
	void msg()
	{
		System.out.println("Hello Selvaraj");
	}
}
class Method_6
{
	public static void main(String... args)
	{
		new A().getA().msg();
	}
}
