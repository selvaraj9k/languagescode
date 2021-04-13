class Student
{
	int id;
	String name;
}
class ObjectofClass
{
	public static void main(String[] args)
	{
		Student sa = new Student();
		Student sr = new Student();
		sa.id = 01;
                sr.id = 02;
		sa.name = "selva";
		sr.name = "raj";
                System.out.println(sa.id+" "+sa.name);
		System.out.println(sr.id+" "+sr.name);;
	}
}	
