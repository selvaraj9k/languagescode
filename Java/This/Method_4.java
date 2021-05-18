class Method_4
{
	void m(Method_4 obj)
	{
		System.out.println("method invoked");
	}
	void p()
	{
		m(this);
	}
	public static void main(String args[])
	{
		Method_4 s = new Method_4();
		s.p();
	}
}
