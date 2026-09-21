import java.util.Scanner;
class it26101501lab9q1{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	double a,b,c,dicriminant;
	double[] x = new double[2];
	System.out.println("Enter the value a:");
	a=input.nextDouble();
	System.out.println("Enter the value b:");
	b=input.nextDouble();
	System.out.println("Enter the value c:");
	c=input.nextDouble();
	
	dicriminant=Math.pow(b, 2) - (4 * a * c);;
	
	if(dicriminant>0)
	{
		x[0]=((-b)+Math.sqrt (dicriminant))/(2*a);
	x[1]=((-b)-Math.sqrt	(dicriminant))/(2*a);
	System.out.println("ROOT1:"+x[0]);
	System.out.println("ROOT1:"+x[1]);
	}

else if(dicriminant==0)
	
{
		x[0]=(-b)/(2*a);
	x[1]=(-b)/(2*a);
	System.out.println("ROOT1:"+x[0]);
	System.out.println("ROOT1:"+x[1]);}
else
{
	
	System.out.println("roots are not real");
	}


	}
}
