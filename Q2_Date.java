

/*
2. Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data members. Also add the display function.  Create the 
object of this class in main method and invoke all the methods in that class.
*/
public class Q2_Date {
		
	private int dd;
	private int mm;
	private int yy;
	
	public Q2_Date()
	{
		this.dd=15;
		this.mm=9;
		this.yy=2001;
	}

	public Q2_Date(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this.dd=i;
		this.mm=j;
		this.yy=k;
	}
	
	
	public int getdd()
	{
		return dd;
	}
	public void setdd(int i)
	{
		this.dd=i;
	}
	
	
	public int getmm()
	{
		return mm;
		
	}
	public void setmm(int j)
	{
		this.mm=j;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	
	
	public void display()
	{
		System.out.println(dd+'/'+mm+'/'+yy);
	}
	
	
	public void display(int x,int y,int z)
	{
		this.dd=x;
		this.mm=y;
		this.yy=z;
		
		System.out.println("today's date is "+x+'/'+y+'/'+z);
	}
	
	
}
