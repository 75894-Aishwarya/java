import java.util.Scanner;

/**
	 6. Accept two numbers and calculate GCD of them.
	 */
public class Q6 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter number to find factorial ");
		Scanner sc=new Scanner(System.in); 
		a=sc.nextInt();
		b=sc.nextInt();
		
		    while (b != 0) {
		        int temp = b;
		        b = a % b;
		        a = temp;
		    }
		    System.out.println("GCD is "+a);
		
	}

}
