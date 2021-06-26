class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b,double c)
	{
		return a+b+c;
	}
}
class MethodOverloading
{
	public static void main(String[] args)
	{
		System.out.println(Adder.add(11,12));
		System.out.println(Adder.add(12,23,25));
	}
}
