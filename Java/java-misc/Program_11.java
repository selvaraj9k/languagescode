class Program_11
{
        public static void main(String[] args)
        {
         int count = 5;
	 double multiplier = 2.5;
	 int answer = (int)(count*multiplier);
	 answer = (answer*count)%10;
	 System.out.println(answer);
	 }
}
