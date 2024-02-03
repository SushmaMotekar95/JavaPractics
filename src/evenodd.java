import java.util.*;
public class evenodd {
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
	    	String result="";
	    	String result1="";
	    	for(int i=0;i<n;i++)
	    	{
	    		if(array[i]%2==0)
	    		{
	    			result=result+" "+array[i];
	    		}
	    		if(array[i]%2!=0)
	    		{
	    			result1=result1+" "+array[i];
	    		}
	    		
	    		
	    	}
	    		
	    	System.out.println("even elements in array is :=> "+result);
	    	System.out.println("odd elements in array is :=> "+result1);
		}
}
