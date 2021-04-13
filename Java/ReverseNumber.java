import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String args[])
	{
        int number=0,reversenumber=0;
	Scanner sr = new Scanner(System.in);
	System.out.println("Enter the numbers : ");
	number=sr.nextInt();
	while(number!=0)
	{
		reversenumber = reversenumber*10;
		reversenumber = reversenumber+number%10;
		number = number/10;
	}
	System.out.println("Reverse of number is : "+reversenumber);
	}
}
