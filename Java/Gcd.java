import java.util.Scanner;
public class Gcd
{
	public static void main(String args[]){
		int a,b,i,hcf=0;
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		a = sr.nextInt();
		System.out.println("Enter the second number : ");
		b = sr.nextInt();
		for (i=1;i<=a||i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				hcf=i;
			}
		}
			System.out.println("GCD of two numbers :"+hcf);
		
		}
}
