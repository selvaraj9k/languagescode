class Selva
{
	Method_5 obj;
	Selva(Method_5 obj)
	{
		this.obj=obj;
	}
	void display()
	{
		System.out.println(obj.data);
	}
}
class Method_5
{
	int data=10;
	Method_5()
	{
		Selva r = new Selva(this);
		r.display();
	}
	public static void main(String[] args)
	{
		Method_5 s = new Method_5();

	}
}
