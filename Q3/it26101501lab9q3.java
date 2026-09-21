class it26101501lab9q3
{
	public static int adding( int num1,int num2)
	{int sum=num1+num2;
	            return sum;}
	public static int multiplying(int num4,int num3)
	{int multiple=num4*num3;
	          return multiple;}
 public static int squarevalue(int num)
 {int square=num*num;
        return square;}
public static void main(String args[]){
   int i=squarevalue((multiplying(3,4))+(multiplying(5,7)));
int ii=squarevalue(adding(4,7))+squarevalue(adding(8,3));
System.out.println("result of(3*4+5*7)^2:"+i);
System.out.println("result of(8+3)^2+(4+7)^2:"+ii);
}
}