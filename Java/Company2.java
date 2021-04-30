class Company2
{
	int id;
	String name;
	static String companyname="Velmani Technolgies";
	Company2(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+companyname);
	}
	public static void main(String args[])
	{
		Company2 e1 = new Company2(1,"selvaraj");
		Company2 e2 = new Company2(2,"Jhon meckency");
		e1.display();
		e2.display();
	}
}

