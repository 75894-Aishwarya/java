import java.util.Scanner;


	/**
	2. Write a program to accept two integers x and n and compute x raised to n.
	 */
public class Q2 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			int x,n;
			System.out.println("Enter number and power ");
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt();
			n=sc.nextInt();
			int res=1;
			for(int i=1;i<=n;i++)
			{
				res=res*x;
				
			}
			System.out.println(x+" raise to "+n+" is "+res);
	}

}
