import java.io.*;
class Employee
{
	String name;
	int age;
	String designation;
	public Employee(String name)
	{
		this.name = name;
	}
	public void empAge(int empAge)
	{
		age = empAge;
	}
	public void empDesignation(String empDesignation)
	{
		designation = empDesignation;
	}
	public void printEmployee()
	{
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
		System.out.println("Designation:"+designation);
	}
}
class EmployeeTest
{
	public static void main(String args[])
	{
        Employee empOne = new Employee("Linux Torvalds");
	Employee empTwo = new Employee("selvaraj");
	empOne.empAge(50);
	empOne.empDesignation("Open Source Developer");
	empOne.printEmployee();
	empTwo.empAge(19);
	empTwo.empDesignation("Full Stack Developer");
	empTwo.printEmployee();
	}
}

