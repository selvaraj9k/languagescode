import java.util.*;
class Calculate
{
	static int cube(int x)
	{
		return x*x*x;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int result=Calculate.cube(s.nextInt());
		System.out.println(result);
	}
}
