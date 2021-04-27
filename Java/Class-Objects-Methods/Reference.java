class Student
{
	int id;
	String name;
}
class Reference
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.id=49;
		s.name="selvaraj";
		System.out.println(s.id+" "+s.name);
	}
}
