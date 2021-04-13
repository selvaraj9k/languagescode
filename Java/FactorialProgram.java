import java.util.*;
	  class FactorialProgram
	{
		public static void main(String[]args)
		{
		Scanner s=new Scanner (System.in);
		int i,Factorial=1,Number;
		System.out.println("ENTER THE NUMBER TO FIND FACTORIAL PROGRAM =");
		Number= s.nextInt();
		for(i=1;i<=Number;i++)
		{
			Factorial=Factorial*i;

		}
		System.out.println("THE FACTORIAL NUMBER of"+" "+Number+" "+"IS"+" "+Factorial);
	}
	}  