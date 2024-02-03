import java.util.*;
public class arraysum 
{
    public static void main(String args[])
	{
    	Scanner sc=new Scanner(System.in); 
    	int[] array = new int[10]; 
    	System.out.print("Enter the array range :=>");
    	int n=sc.nextInt();
    	System.out.print("Enter the array element :=> ");
    	for(int i=0; i<n; i++) {
    		array[i]=sc.nextInt();  
    	}
    	int sum=0;
    	for(int i=0;i<n;i++)
    	{
    		sum=sum+array[i];
    	}
    	System.out.print("Sum of array element is :=> "+sum);
	}
}
