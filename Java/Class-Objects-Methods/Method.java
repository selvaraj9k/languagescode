class Student
{
	int rollno;
	String name;
	void insertRecord(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void displayInformation()
	{
		System.out.println(rollno+" "+name);
	}

}
class Method
{
	public static void main(String... args)
{
	Student s1 = new Student();
	Student s2 = new Student();
	s1.insertRecord(1,"selvaraj");
	s2.insertRecord(2,"selvapriya");
	s1.displayInformation();
	s2.displayInformation();
}
}
