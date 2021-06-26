interface printable
{
	void print();
}
class Hello implements printable
{
public void print()
{
	System.out.println("Hello");
}
	public static void main(String[] args)
	{
		Hello s = new Hello();
		s.print();
	}
}
