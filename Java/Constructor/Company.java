class Company
{
	int no;
	String company;
	Company(int n,String c)
	{
		no = n;
		company = c;
	}
	Company(Company s)
	{
		no = s.no;
		company = s.company;
	}
	void display()
	{
		System.out.println(no+" "+company);
	}
	public static void main(String []args)
	{
		Company c0 = new Company(1,"RedHat");
		Company c1 = new Company(c0);
		c0.display();
		c1.display();
	}
}
