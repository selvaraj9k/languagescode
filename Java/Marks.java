public  class Marks
{
	String subject1;
	int sub1Marks;
	String subject2;
	int sub2Marks;
	public static void main(String... args)
	{
		Marks mk = new Marks();
		mk.subject1="science";
		mk.sub1Marks=99;
		mk.subject2="computer science";
		mk.sub2Marks=90;

		int TotalMarks = 99+90;
		System.out.println("Marks in"+mk.subject1+":" +mk.sub1Marks);
		System.out.println("Marks in"+mk.subject2+":" +mk.sub2Marks);
		System.out.println("Total Marks: " +TotalMarks);
	}
}
