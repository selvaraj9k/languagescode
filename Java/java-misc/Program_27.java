public class Program_27
{
	int cakes = 5;
	void order(int cakes)
	{
		this.cakes=cakes;
	}
	public static void main(String[] args)
	{
	Program_27 t4 = new Program_27();
	t4.order(10);
	System.out.println("CAKES="+t4.cakes);
	}
}
