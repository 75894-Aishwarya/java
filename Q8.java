import java.util.Scanner;

/**
	 8. Write a program to print all prime numbers between 1 to n
	 */
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the maximum number:");
	        int n = scanner.nextInt();

	        for (int i = 2; i <= n; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	                
	            }
	            if (isPrime) {
	                System.out.println(i);
	            }
	        
	        }
	}
}

