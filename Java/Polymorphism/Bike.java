class Bike
{
	void run()
	{
		System.out.println("running");
	}
}
class Splendor extends Bike
{
	void run()
	{
		System.out.println("Bike is Blue in color");
	}
	public static void main(String... args)
	{
		Bike s = new Splendor();
		s.run();
	}

}
