class Company1
{
	int no;
	String company;
	Company1(int n,String c)
	{
		no = n;
		company = c;
	}
	Company1()
	{
	}
	void display()
	{
		System.out.println(no+" "+company);
	}
	public static void main(String args[])
	{
		Company1 c1 = new Company1(1,"Amazon");						
		Company1 c2 = new Company1();
		c2.no = c1.no;
		c2.company = c1.company;
		c1.display();
		c2.display();
	}
}
