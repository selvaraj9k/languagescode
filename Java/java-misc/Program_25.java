class Fox
{
	int legs = 2;
}
public class Program_25
{
	public static void main(String... args)
	{
	Fox t1 = new Fox();
	System.out.println("T1 before : "+t1.legs);
	t1.legs=4;
	System.out.println("T1 After  : "+t1.legs);
	}
}

