import java.util.*;
public class MAX
{
	public static void main(String[] args)
	{
		Scanner key=new Scanner(System.in);
		
		System.out.print("請輸入3個數值");		
		double a=nextDouble();	
		double b=nextDouble();
		double c=nextDouble();
	
		double x=Math.max(a,b);
		double y=Math.max(x,c);

		System.out.printf("三者中最大值為%f",y);
	}

    private static double nextDouble() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextDouble'");
    }
}