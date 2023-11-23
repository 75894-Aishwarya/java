import java.util.Scanner;

/*1:Write a program that accepts numbers continuously as long as the number is positive and prints the 
sum of the given numbers.*/
public class Q1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter numbers ");
		do
		{
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
		}
		while(n>0);
	}

}
