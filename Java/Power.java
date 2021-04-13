import java.util.Scanner;
	public class Power
	{
		public static void main(String[] args)
		{
			int number,i,exponent,power;
			power=1;
			Scanner java = new Scanner(System.in);
			System.out.println("Enter the number : ");
			number = java.nextInt();
			System.out.println("Enter the exponent value : ");
			exponent = java.nextInt();
			for(i=1;i<=exponent;i++)
			{
				power=power*number;
			}
			System.out.println("The Result of "+number+" power "+exponent+" = "+power);
		}
	}


		
