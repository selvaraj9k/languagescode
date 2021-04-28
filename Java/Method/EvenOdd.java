import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number=s.nextInt();
		findEvenOdd(number);
	}
public static void findEvenOdd(int number)
{
	if(number%2==0)
		System.out.println(number+"is even");
	else
		System.out.println(number+"is odd");

}
}
