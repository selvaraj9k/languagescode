public class InstanceMethod
{
	public static void main(String[] args)
	{
		InstanceMethod s = new InstanceMethod();
		System.out.println("The Sum "+s.add(5,5));
	}
	int s;
	public int add(int a,int b)
	{
		s=a+b;
		return s;
	}
}
