class Labeled_for_loop
{
	public static void main(String... args)
	{
	ss:
		for(int i=1;i<=10;i++)
		{
		rr:
			for(int j=1;j<=10;j++)
			{
				if(i==9&&j==9)
				{
				break ss;
				}
				System.out.println(i+" "+j);

			}
		}

	}
}
