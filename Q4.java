import java.util.Scanner;

/**
	4. Write a program to calculate factorial of a number. 
For e.g. factorial of 5 = 5! = 5 *4*3*2*1 = 120
	 */
public class Q4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number to find factorial ");
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is "+fact);
	}

}
