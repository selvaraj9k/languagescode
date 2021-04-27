class Rectangle
{
	int length;
	int width;
	void insert(int l,int w)
	{
		length=l;
		width=w;
	}
	void display()
	{
		System.out.println(length*width);
	}
}
class TestRectangle
{	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.insert(12,14);
		r2.insert(4,7);
		r1.display();
		r2.display();
	}
}
