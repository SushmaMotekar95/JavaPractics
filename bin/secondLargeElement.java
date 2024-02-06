package array;

public class secondLargeElement {
	public static void main(String args[]) {
		int[] arr= {25,10,35,15,45};
		System.out.println();
		System.out.println("***Program to find second largest Element in given array***");
		System.out.println();
		System.out.print("- Array :=> [ ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
		 secondLargeElement obj = new secondLargeElement();
		 obj. secondlargest(arr);
	}
	void secondlargest(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("- Second Largest Element in Array is :=> "+arr[arr.length-2]);
	}
}
