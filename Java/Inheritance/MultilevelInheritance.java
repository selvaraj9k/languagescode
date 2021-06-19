class Color
{
	void color()
	{
		System.out.println("browish...");
	}

}
class Eat extends Color
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Eat
{
	void bark()
	{
		System.out.println("barking...");
	}

}

class MultilevelInheritance
{
	public static void main(String[] args)
	{
		Dog s = new Dog();
		s.bark();
		s.eat();
		s.color();
	}
}

