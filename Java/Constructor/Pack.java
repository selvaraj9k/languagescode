class Pack
{
	String pack1,pack2;
	Pack(String pk1,String pk2)
	{
	pack1 = pk1;
	pack2 = pk2;
	}
	void display()
	{
		System.out.println(pack1+" "+pack2);
	}
	public static void main(String []args)
	{
		Pack p1 = new Pack("apt","deb");
		Pack p2 = new Pack("yum","rpm");
	       	p1.display();
		p2.display();	
	}
}
