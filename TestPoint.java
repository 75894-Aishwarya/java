import java.util.Scanner;

	/**
	 
5.6 Write TestPoint class    with a main method
Accept co ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2)

5.7 Use getDetails method to display point details.(p1's details & p2's details)

5.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)

5.9 Display distance between p1 & p2
	 */


public class TestPoint {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter coordinates for x1 and y1 : ");
		Scanner sc =new Scanner(System.in);
		double	x1=sc.nextDouble();
		double y1=sc.nextDouble();
		
		
		
		System.out.println("Enter coordinates for x2 and y2 : ");
		double	x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		
		
		// Use getDetails method to display point details
        System.out.println("Details of Point 1: " + p1.toString());
        System.out.println("Details of Point 2: " + p2.toString());
        
        
        if(p1.isEqual(p2))
        {
        	System.out.println("p1 and p2 are at same position");
        }
        else
        {
        	System.out.println("p1 and p2 are at different position");
        }
        
        double dis=p1.calculateDistance(p2);
        
        	System.out.println("Distance between two points "+dis);
   

	}

}
