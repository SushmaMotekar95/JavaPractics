import java.util.*;
public class largeNo {
	public static void main(String agrs[])
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the 1st Integer :=> ");
		int a=sc.nextInt();
		System.out.print("Enter the 2nd Integer :=> ");
		int b=sc.nextInt();
		System.out.println("Two Integers is :=> "+a+" "+b);
		if(a>b)
		{
			System.out.println("The Greatest Number is :=> "+a);
		}
		else
		{
			System.out.println("The Greatest Number is :=> "+b);
		}
		
		
	}

}
