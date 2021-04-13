import java.util.*;
public class FIBONACCIPROGRAM
{
	public static void main(String[]args)
		{
          Scanner s=new Scanner(System.in);
          int Number,i=2,j=0,k=1,fib;
          System.out.println("Enter the number to find Fibonacci series :");
          Number = s.nextInt();
          System.out.println("THE FIBONACCI SERIES ARE :");
          System.out.println(j+"\n"+k); 
          for(;i<=Number;i++)
          {
          	fib=j+k;
          	System.out.println(fib);
            j=k;
            k=fib;
            fib=j+k;
            
          }
		}

}