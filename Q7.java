import java.util.Scanner;

/**
	 7. Write a menu driven program to do following operations :
a) Compute area of circle
b) Compute area of rectangle
c) Compute area of triangle
d) Exit
Display menu, ask choice to the user, depending on choice accept the parameters and perform the 
operation. Continue this process until user selects exit option.
	 */

public class Q7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
		System.out.println("Choose the option 1) Compute area of circle 2) Compute area of rectangle 3) Compute area of triangle 4) Exit ");
			Scanner s=new Scanner(System.in);
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter radius of circle ");
				int r=s.nextInt();
				double pi=3.14;
				double area= pi*r*r;
				System.out.println("Area of "+area);
			
			break;
			case 2:
				System.out.println("Enter lenght and breadth of lenght: ");
				int l=s.nextInt();
				int b=s.nextInt();
				int rarea= l*b;
				System.out.println("Area of "+rarea);
			
			break;
			case 3:
				System.out.println("Enter heightand base of triangle ");
				int h=s.nextInt();
				int base=s.nextInt();
				double tri=0.5*h*base;
				System.out.println("Area of "+tri);
			break;
			case 4:
				System.exit(0);
				
		    break;
		    default:
		    	System.out.println("Enter vallid choice ");
			}
		}
	}
}
