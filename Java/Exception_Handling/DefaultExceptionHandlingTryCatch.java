public class DefaultExceptionHandlingTryCatch
{
	public static void main(String[] args)
	{
		m1();
	}

	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		m3();
	}
	public static void m3()
	{
		m4();
	}
	public static void m4()
	{
		try
		{
			System.out.println("Before Dividing");
			int s =5/0;
			System.out.println("After Dividing");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter proper order");
		}
	}
}
