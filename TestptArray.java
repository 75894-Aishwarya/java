import java.util.Scanner;

//User Create Array Of Point2D and store 5 objects in it;
public class TestptArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point2D[] arr=new Point2D[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter co-ordinates x and y for index "+(i+1)+" : ");
			Scanner sc=new Scanner(System.in);
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			
			arr[i]=new Point2D(x,y);
			
		}
		
		System.out.println("array of corodinates  :");
		for(int i=0;i<5;i++)
		{
			System.out.println("Point "+(i+1)+" : "+arr[i].toString());
		}

	}

}
