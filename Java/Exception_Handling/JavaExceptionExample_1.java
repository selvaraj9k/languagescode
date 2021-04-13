public class JavaExceptionExample_1
{
	public static void main(String args[])
	{
		try{
			int data =100/0;
			System.out.println(data);
		}catch(ArithmeticException s){System.out.println(s);}
		System.out.println("Program finished");
	}
}
