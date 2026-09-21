import java.util.Scanner;
class it26101501lab9q2
{
	public static double circle_area( double radius)
	{ final double pi=22.0/7.0;
		double area=pi*radius*radius;
	   return area;}
	   public static void main(String args[])
	   { Scanner input=new Scanner(System.in);
	     double radius;
		 System.out.print("enter the radius of circle:");
		 radius=input.nextDouble();
		   double areaofcircle=circle_area(radius);
         

        System.out.println("area of circle radius "+radius+":"+areaofcircle);	   }
}