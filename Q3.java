import java.util.Scanner;

/**
	3. Write a program to accept a character, an integer n and display the next n characters.
	 */
public class Q3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to print how many characters u want print ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter charcters ");
		for(int i=1;i<=n;i++)
		{
			char a;
			a=sc.next().charAt(0);
		}
	}

}
