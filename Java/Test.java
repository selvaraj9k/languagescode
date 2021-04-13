import java.util.Scanner;
public class Test
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two integer numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
}
