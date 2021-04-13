import java.util.Scanner;
public class Addtwonumbers
{
	public static void main(String[] args)
	{
         int number1,number2,sum;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the First Number: ");
	 number1=sc.nextInt();
	 System.out.println("Enter the Second Number: ");
	 number2=sc.nextInt();
	 sc.close();
	 sum=number1+number2;
	 System.out.println("The Addition of Two Numbers are :"+sum);
	}
}
