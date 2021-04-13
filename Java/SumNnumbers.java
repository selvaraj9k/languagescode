import java.util.Scanner;
public class SumNnumbers
{
	public static void main(String[] args)
	{	
		int n,sum=0;
		Scanner sr = new Scanner(System.in);
                System.out.println("Enter the how many numbers you want to add :");
		n=sr.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the "+n+" numbers:");
		for(int i=0;i<n;i++)
		{
				System.out.println("Enter number "+(i+1)+":");
				a[i]=sr.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of "+n+" numbers is ="+sum);
	}
}
