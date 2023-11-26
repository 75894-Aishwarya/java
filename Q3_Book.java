/*3. Create a class Book with data members as bname,id,author,price.  Also add the display function.  Create 
the object of this class in main method and invoke all the methods in that class. */
public class Q3_Book {
	private String bname;
	private int id;
	private String author;
	private int price;
	
	public Q3_Book()
	{
		this.bname="Mrutunjay";
		this.id=101;
		this.author="Shivaji Savant";
		this.price=220;
	}
	
	public Q3_Book(String n,int i,String a,int p)
	{
		this.bname=n;
		this.id=i;
		this.author=a;
		this.price=p;
	}
	
	void display()
	{
		System.out.println(bname+" "+id+" "+author+" "+price);
	}
	void display(String a,int b,String c,int d)
	{
		this.bname=a;
		this.id=b;
		this.author=c;
		this.price=d;
		System.out.println(a +" "+ b+" "+c+" "+d);
		
	}
	
}
