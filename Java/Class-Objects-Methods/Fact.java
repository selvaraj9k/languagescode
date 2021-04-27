import java.util.*;
class Fact
{
	void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String... args)
	{
		new Fact().fact(5);
	}
}
