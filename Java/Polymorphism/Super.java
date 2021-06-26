class Animal
{
	String color="white";
}
class Dog extends Animal
{
	String color="black";
	int printColor()
	{
		System.out.println(color);
		System.out.println(super.color);
		return 0;
	}

}
class Super
{
	public static void main(String[] args)
	{
	Dog s = new Dog();
	s.printColor();
	}
}
