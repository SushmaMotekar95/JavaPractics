import java.util.*;
public class decesionstatement {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st Number:=>");
		int a=s.nextInt();
		System.out.print("Enter 2st Number:=>");
		int b=s.nextInt();
		System.out.print("Enter 3st Number:=>");
		int c=s.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println(+a+" is the large number");
		}
		else if(b>=a && b>=c)
		{
			System.out.println(+b+" is the large number");
		}
		else
		{
			System.out.println(+c+" is the large number");
		}
		
		
	}

}
