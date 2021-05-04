class Student
{
	int rollno;
	String name;
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}

	void display()
	{
		System.out.println(rollno+" "+name);
	}
}
class Method1
{
	public static void main(String []args)
	{
		Student s1 = new Student(49,"selvaraj");
		Student s2 = new Student(99,"swetha");
		s1.display();
		s2.display();
	}
}
