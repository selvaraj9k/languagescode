public class TestStudent_4
{
	int x = 5;
	public static void main(String[] args)
	{
		TestStudent_4 obj1 = new TestStudent_4();
		TestStudent_4 obj2 = new TestStudent_4();
		obj2.x = 25;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}
}
