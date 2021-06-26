class Vehicle
{
	int run()
	{
		System.out.println("Vehicle is running");
		return 0;
	}
}
class Bike extends Vehicle
{
	public static void main(String... args)
	{
	Bike s = new Bike();
	s.run();
	}
}
