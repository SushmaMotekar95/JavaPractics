
import java.util.*;
public class reverse {

	 public static void main(String[] args) {
	        int[] arr = {1,2,3,4,5};
	  
	        System.out.print("Array is :=> [ ");
	        for(int i=0;i<arr.length;i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println("]");
	        reverse(arr);
	        display(arr);
	    }
	    public static void reverse(int[] arr) {
	        int i = 0;
	        int j = arr.length -1;
	        
	        while(i < j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	    }
	    
	    
	    public static void display(int[] arr) {
	    	System.out.print("Reverse Array is :=> [ ");
	        for(int i=0;i<arr.length;i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println("]");
	    }
	    
	   
	}


