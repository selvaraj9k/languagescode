import java.util.Scanner;
public class Constants
{
	private static final int Price = 99;
	static public void main(String... args)
	{
	int unit;
	double Total_Bill;
	System.out.println("Enter the number of units you have used: ");
	Scanner sc = new Scanner(System.in);
	unit = sc.nextInt();
	Total_Bill=Price*unit;
	System.out.println("The Total amount you have to deposit is : "+Total_Bill);
	}
}
	
