/*1. Create a class Person with data members as name, age, city. Write getters and setters for all the data 
members. Also add the display function.Inside tester class invoke all the methods in that class. 
*/
public class Person {
	private String name,city;
	private int age;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getage()
	{
		return age; 
	}
	public void setage()
	{
		this.age=age;
	}
	
	public String getcity()
	{
		return city;
	}
	
	public Person()
	{
		this.name="Aishwarya";
		this.age=12;
		this.city="Parli";
		
	}
	 
	public Person(String name,int age,String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	public void display()
	{
		System.out.println(name+ ' '+age +' '+city);
	}
	
	public void display(String nm,int r,String c)
	{
		this.name=nm;
		this.age=r;
		this.city=c;
		System.out.println(nm + ' '+r+ ' '+ c);
	}
	
	
	
	
}
