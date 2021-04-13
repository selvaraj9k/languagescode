import java.util.*;
public class ArmstrongNumber
{
	public static void main(String args[])
	{
		int number,check,rem,sum=0;
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		number = sr.nextInt();
		check=number;
		for(;check!=0;)
		{
			rem=check%10;
			sum=sum+(rem*rem*rem);
			check=check/10;
		}
		if(sum==number)
			System.out.println("Number is a Armstrong Number");
		else
			System.out.println("Number is not a Armstorng Number");
	}
}
