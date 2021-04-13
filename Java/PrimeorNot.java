import java.util.Scanner;
public class PrimeorNot
{
	public static void main(String args[])
	{
		int number,i,count=0;
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter the number : ");
	        number = sr.nextInt();
                for(i=2;i<number;i++)
		{
			if(number%i==0)
			{
			   count++;	
			   break;
			}
		}
		if(count==0)
		{
			System.out.println("This is a Prime Number");
		}
		else 
		{
			System.out.println("This is not a Prime Number");
		}

	}
}

		 		   
				
