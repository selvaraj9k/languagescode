class Animal
{
	void eat()
	{
		System.out.println("eating..");
	}
}
class Cow extends Animal
{
	void moo()
	{
		System.out.println("mooing....");
	}
}
class Dog extends Animal
{
	void bark()
	{
	 System.out.println("barking..."); 
	}
}
class HierarchicalInheritance
{

	public static void main(String... args)
	{
		Dog s = new Dog();
		s.bark();
		s.eat();
	}	
}
