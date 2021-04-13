public class ExceptionHandlingwithTryCatch
{
	public static void main(String[] args)
	{
	        System.out.println("One");
		System.out.println("Two");
		try{
			System.out.println("Before Divide");
				int a=1/0;
			System.out.println("After Divide");
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divided by Zero");
			System.out.println("Three");
			System.out.println("Four");
		}
		System.out.println("Five");
	}
}
