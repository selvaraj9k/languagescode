public class TestStudent_2
{
	String name;
	int rollNo;
	int age;
	TestStudent_2()
	{
		name = "selvaraj";
		rollNo = 49;
		age = 19;
	}
	void display()
	{
		System.out.println("Student name = "+name);
		System.out.println("Student Rollno = "+rollNo);
		System.out.println("Student Age = "+age);
	}

	
public static void main(String[] args)
{
	TestStudent_2 st = new TestStudent_2();
	st.display();
}
}
