import java.util.Scanner;
public class PalindromeorNot
{
	public static void main(String args[])
	{
		int number,sum=0,r,temp;
		Scanner sr = new Scanner(System.in);
	        System.out.println("Enter the Numbers : ");
                number = sr.nextInt();
                temp=number;
                while(number>0)
	        {
	         r=number%10;
                 sum=(sum*10)+r;
                 number=number/10;
                 }
                if(temp==sum)
		{
	         System.out.println("The Numbers are Palindrome Numbers");
		}
                  else
		 { 
	         System.out.println("The Numbers are Not Palindrome Numbers");
		}
	}
}
