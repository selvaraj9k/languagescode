import java.util.Scanner;
public class Swap
{
	public static void main(String args[])
	{
	  Scanner sr = new Scanner(System.in);
	  int number01,number02,swap;
	  System.out.println("Enter the Number : ");
	  number01 = sr.nextInt();
	  System.out.println("Enter the Number : ");
	  number02 = sr.nextInt();
	  System.out.println("Before Swapping\n");
	  System.out.println("Number01 = "+number01+"\nNumber02 = "+number02);
	  swap=number01;
	  number01=number02;
	  number02=swap;
	  System.out.println("\nAfter Swapping\n");
	  System.out.println("Number01 = "+number01+"\nNumber02 = "+number02);
	}
}


