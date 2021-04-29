class Linux
{
	int version;
	String name;
	Linux(int v,String n)
	{
		version=v;
		name=n;
	}
	void display()
	{
		System.out.println(version+" "+name);
	}
	public static void main(String[] args)
	{
		Linux v1 = new Linux(2020,"RedHat");
		Linux v2 = new Linux(2021,"Ubuntu");
		v1.display();
		v2.display();

	}
}
