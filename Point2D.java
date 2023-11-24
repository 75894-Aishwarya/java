

//5.1 Create a class Point2D ,    : for representing a point in x-y co-ordinate system.

public class Point2D {
			private double x;
			private double y;
			
			
//5.2 Create a parameterized constructor to init x & y co-ords.
			public Point2D(double i,double j)
			{
				this.x=i;
				this.y=j;
			}
			

			public double getX() {
				return x;
			}
			public void setX(double x) {
				this.x = x;
			}
			public double getY() {
				return y;
			}
            public void setY(double y) {
				this.y = y;
			}




//5.3 Add a method to return string form of  point's x & y co-ords
//Hint :  public String toString()) 			
			public String toString()
			{
				return "("+ x + " "+y+")";
			}
			
			
/*5.4 Add isEqual method to Point2D class :a boolean returning method : must return true if both points are 
 * having same x,y co-ords or false otherwise.
eg : public boolean isEqual(Point2D anotherPoint)
{
 .......
}
eg : p1.isEqual(p2)*/	
			
			
			public boolean isEqual(Point2D anotherPoint)
			{
				if (this.x==anotherPoint.x && this.y==anotherPoint.y)
				{
					return true;
				}
				return false;
			}
			
			
/*5.5 Add calculateDistance method to calculate distance between current point and specified point & return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
eg : public double calculateDistance(Point2D anotherPoint)
{
  Math.sqrt(.....);
}
*/
			
			public double calculateDistance(Point2D anotherPoint)
			{
				double xdisBet=this.x-anotherPoint.x;
				double ydisBet=this.y-anotherPoint.y;
				return Math.sqrt(Math.pow(xdisBet, 2)+Math.pow(ydisBet, 2));
	
				
			}
	
			
			
			
			
			
			

}
