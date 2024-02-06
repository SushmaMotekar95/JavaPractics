import java.util.*;
public class grads {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter Student Marks :=> ");
		int m=sc.nextInt();
		if(m>80 && m<=100)
		{
			System.out.println("A Grade");
		}
		else if(m>60 && m<=80)
		{
			System.out.println("B Grade");
		}
		else if(m>50 && m<=60)
		{
			System.out.println("C Grade");
		}
		else if(m>45 && m<=50)
		{
			System.out.println("D Grade");
		}
		else if(m>25 && m<=45)
		{
			System.out.println("E Grade");
		}
		else if(m>=0 && m<=25)
		{
			System.out.println("Fail");
		}
		
		
		
	}

}
