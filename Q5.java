import java.util.Scanner;

/**
	5. Write a program to calculate factors of a given number.
	 */
public class Q5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number to find factorial ");
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt();
		int factorial;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Factors of "+n+" is "+i);
			}
			
		}

	}

}
